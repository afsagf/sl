package com.sy.service.wzx.impl;

import com.sy.dto.wzx.MessageAndReply;
import com.sy.exception.SLException;
import com.sy.mapper.wzx.Au_userMapper2;
import com.sy.mapper.wzx.Leave_messageMapper;
import com.sy.mapper.wzx.ReplyMapper;
import com.sy.model.Leave_message;
import com.sy.service.wzx.Leave_messageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class Leave_messageServiceImpl implements Leave_messageService {

    @Autowired
    private Leave_messageMapper messageMapper;
    @Autowired
    private ReplyMapper replyMapper;
    @Autowired
    private Au_userMapper2 userMapper2;

    @Transactional(propagation = Propagation.REQUIRED)
    public boolean create(Leave_message message, Long id) throws SLException {
        Integer i = null;
        if (message.getMessagecontent() == null || "".equals(message.getMessagecontent())) {
            throw new SLException("内容不能为空");
        } else {
            message.setCreatedby(userMapper2.selectById(id).getLoginCode());
            message.setCreatetime(new Date());
            message.setState(0);
            i = messageMapper.insert(message);
        }
        return i > 0;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public boolean remove(Long id) {
        return messageMapper.delete(id) > 0;
    }


    public List<Leave_message> getByAdmin() {
        return messageMapper.select();
    }

    /**
     * 消息及回复
     *
     * @param id
     * @return
     */
    public List<MessageAndReply> getByUser(Long id) {
        List<MessageAndReply> lists = new ArrayList<>();
        List<Leave_message> list = messageMapper.selectByLoginCode(userMapper2.selectById(id).getLoginCode());
        for (Leave_message leave_message : list) {
            MessageAndReply mr = new MessageAndReply();
            mr.setMessage(leave_message);
            mr.setReply(replyMapper.selectByMid(leave_message.getId()));
            lists.add(mr);
        }
        return lists;
    }

    /**
     * 留言详情 含回复
     *
     * @param id
     * @return
     */
    public MessageAndReply getById(Long id) {
        MessageAndReply mr = new MessageAndReply();
        mr.setMessage(messageMapper.selectById(id));
        mr.setReply(replyMapper.selectByMid(id));
        return mr;
    }

    /**
     * 留言详情 不含回复
     *
     * @param id
     * @return
     */
    public Leave_message getMessageById(Long id) {
        return messageMapper.selectById(id);
    }
}
