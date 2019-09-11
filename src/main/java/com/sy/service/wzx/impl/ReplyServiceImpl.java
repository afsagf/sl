package com.sy.service.wzx.impl;

import com.sy.dto.wzx.MessageAndReply;
import com.sy.exception.SLException;
import com.sy.mapper.ggy.Au_userMapper;
import com.sy.mapper.wzx.Au_userMapper2;
import com.sy.mapper.wzx.Leave_messageMapper;
import com.sy.mapper.wzx.ReplyMapper;
import com.sy.model.Au_user;
import com.sy.model.Leave_message;
import com.sy.model.Reply;
import com.sy.service.wzx.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional(readOnly = true)
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private Leave_messageMapper messageMapper;

    @Autowired
    private ReplyMapper replyMapper;

    @Autowired
    private Au_userMapper2 userMapper2;

    /**
     * reply需要mid和回复内容 两个参数
     *
     * @param reply
     * @param uid
     * @return
     * @throws SLException
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean create(Reply reply, Long uid) throws SLException {
        Integer i = null;
        Integer j = null;
        if (reply.getReplycontent() == null || "".equals(reply.getReplycontent())) {
            throw new SLException("回复内容不能为空");
        } else {
            reply.setCreatedby(userMapper2.selectById(uid).getLoginCode());
            reply.setCreatetime(new Date());
            i = replyMapper.insert(reply);
            j = messageMapper.update(reply.getMessageid());
        }
        return i > 0 && j > 0;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public boolean remove(Long id) {
        return replyMapper.delete(id) > 0;
    }
}
