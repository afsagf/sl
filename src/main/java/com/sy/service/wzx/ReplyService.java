package com.sy.service.wzx;

import com.sy.exception.SLException;
import com.sy.model.Reply;

public interface ReplyService {

    //插入 回复
    boolean create(Reply reply,Long uid) throws SLException;

    //删除 回复
    boolean remove(Long id);



}
