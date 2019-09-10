package com.sy.service.wzx;

import com.sy.model.Leave_message;

import java.util.List;

public interface Leave_messageService {

    //用户留言及回复查看
    //todo

    //插入
    Integer create(Leave_message message);

    //删除 管理员权限
    Integer remove(Integer id);

    //查看 仅用于管理员 管理员页面查看
    List<Leave_message> get(Integer id);

}
