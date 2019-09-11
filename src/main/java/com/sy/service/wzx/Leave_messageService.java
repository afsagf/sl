package com.sy.service.wzx;

import com.sy.dto.wzx.MessageAndReply;
import com.sy.exception.SLException;
import com.sy.model.Leave_message;

import java.util.List;

public interface Leave_messageService {

    //插入
    boolean create(Leave_message message,Long id) throws SLException;

    //删除 管理员权限
    boolean remove(Long id);

    //查看 仅用于管理员 管理员页面查看
    List<Leave_message> getByAdmin();

    //查看 仅用于普通用户 页面查看
    List<MessageAndReply> getByUser(Long id);

    //留言详情 用于管理员 入参如留言id
    MessageAndReply getById(Long id);

    //回复时留言查看
    Leave_message getMessageById(Long id);



}
