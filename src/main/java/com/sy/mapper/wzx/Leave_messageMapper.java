package com.sy.mapper.wzx;

import com.sy.model.Leave_message;

import java.util.List;

public interface Leave_messageMapper {

    //留言 用户部分


    //插入
    Integer insert(Leave_message message);

    //删除 管理员权限
    Integer delete(Long id);

    //查看 仅用于管理员 管理员页面查看
    List<Leave_message> select();

    //更新 回复状态
    Integer update(Long id);

    //查看 通过留言ID
    Leave_message selectById(Long id);

    //用户查看
    List<Leave_message> selectByLoginCode(String loginCode);

}
