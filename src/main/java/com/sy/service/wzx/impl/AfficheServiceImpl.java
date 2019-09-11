package com.sy.service.wzx.impl;

import com.sy.exception.SLException;
import com.sy.mapper.wzx.AfficheMapper;
import com.sy.mapper.wzx.Au_userMapper2;
import com.sy.model.Affiche;
import com.sy.service.wzx.AfficheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class AfficheServiceImpl implements AfficheService {
    @Autowired
    private AfficheMapper afficheMapper;
    @Autowired
    private Au_userMapper2 userMapper2;

    @Transactional(propagation = Propagation.REQUIRED)
    public boolean create(Long id, Affiche affiche) throws SLException {
        Integer i = null;
        if (affiche.getTitle() == null || "".equals(affiche.getTitle()) || affiche.getContent() == null || "".equals(affiche.getContent())) {
            throw new SLException("请输入完整信息");
        } else {
            affiche.setPublisher(userMapper2.selectById(id).getLoginCode());
            affiche.setPublishTime(new Date());
            i = afficheMapper.insert(affiche);
        }
        return i > 0;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public boolean modify(Affiche affiche) throws SLException {
        Integer i = null;
        if (affiche.getTitle() == null || "".equals(affiche.getTitle()) || affiche.getContent() == null || "".equals(affiche.getContent())) {
            throw new SLException("请输入完整信息");
        } else {
            i = afficheMapper.update(affiche);
        }
        return i > 0;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean remove(Long id) {
        return afficheMapper.delete(id) > 0;
    }

    /**
     * id为对应管理员admin id
     *
     * @param id
     * @return
     */
    public List<Affiche> getByAid(Long id) {
        return afficheMapper.selectByAdmin(userMapper2.selectById(id).getLoginCode());
    }


    public List<Affiche> getAll() {
        return afficheMapper.selectAll();
    }

    public Affiche getById(Long id) {
        return afficheMapper.selectByAid(id);
    }
}
