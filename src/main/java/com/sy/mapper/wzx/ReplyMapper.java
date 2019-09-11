package com.sy.mapper.wzx;

import com.sy.model.Reply;

import java.util.List;

public interface ReplyMapper {

    //回复


    //插入 回复
    Integer insert(Reply reply);

    //删除 回复 根据外键留言id删除
    Integer delete(Long id);

    //查看
    Reply selectByMid(Long id);


}
