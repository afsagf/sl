package com.sy.mapper.wzx;

import com.sy.model.Leave_message;

import java.util.List;

public interface Leave_messageMapper {

    //留言 用户部分

    //用户留言及回复查看
    //todo

    //插入
    Integer insert(Leave_message message);

    //删除 管理员权限
    Integer delete(Integer id);

    //查看 仅用于管理员 管理员页面查看
    List<Leave_message> select(Integer id);


}
