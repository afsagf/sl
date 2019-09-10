package com.sy.mapper.wzx;

import com.sy.model.Reply;

import java.util.List;

public interface ReplyMapper {

    //回复

    //检查是否回复
    List<Reply> selectByMid(Integer id);

    //插入 回复
    Integer insert(Reply reply);

    //删除 回复
    Integer delete(Integer id);


}
