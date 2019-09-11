package com.sy.service.wzx.impl;


import com.sy.exception.SLException;
import com.sy.mapper.wzx.Au_userMapper2;
import com.sy.mapper.wzx.InformationMapper;
import com.sy.model.Information;
import com.sy.service.wzx.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationMapper informationMapper;
    @Autowired
    private Au_userMapper2 userMapper2;
    @Autowired
    private InformationService informationService;

    public boolean verify(Information information) throws SLException {
        if (information.getTitle() == null || "".equals(information.getTitle())
                || information.getContent() == null || "".equals(information.getContent())
                || information.getTypeId() == null
                || information.getTypeName() == null || "".equals(information.getTypeName())
                || information.getFileName() == null || "".equals(information.getFileName())
                || information.getFilePath() == null || "".equals(information.getFilePath())
        ) {
            throw new SLException("请输入完整信息");
        } else {
            return true;
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public boolean create(Long id, Information information) throws SLException {
        Integer i = null;
        if (informationService.verify(information)) {
            information.setPublisher(userMapper2.selectById(id).getLoginCode());
            information.setPublishTime(new Date());
            information.setUploadTime(new Date());
            i = informationMapper.insert(information);
        }
        return i > 0;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public boolean modify(Information information) throws SLException {
        Integer i = null;
        if (informationService.verify(information)) {
            information.setUploadTime(new Date());
            i = informationMapper.update(information);
        }
        return i > 0;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public boolean remove(Long id) {
        return informationMapper.delete(id) > 0;
    }

    /**
     * 管理员查看
     * 发布者查看
     *
     * @param id
     * @return
     */
    public List<Information> getByAid(Long id) {
        return informationMapper.selectByPid(id);
    }


    public List<Information> getAll() {
        return informationMapper.selectAll();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public boolean modifyState(Long id) {
        Integer state = informationMapper.selectStateById(id);
        return informationMapper.updateState(id, state) > 0;
    }

    /**
     * 单个资讯详情
     *
     * @param id
     * @return
     */
    public Information getById(Long id) {
        return informationMapper.selectById(id);
    }


}
