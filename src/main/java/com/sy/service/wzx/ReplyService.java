package com.sy.service.wzx;

import com.sy.model.Reply;

public interface ReplyService {

    //插入 回复
    Integer create(Reply reply);

    //删除 回复
    Integer remove(Integer id);

}
