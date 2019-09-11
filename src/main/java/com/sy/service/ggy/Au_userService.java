package com.sy.service.ggy;

import com.sy.model.Au_user;
import com.sy.model.resp.BaseResp;

public interface Au_userService {
    //登入验证
  BaseResp login(Au_user au_user) throws Exception;
  Au_user findById(Long id) throws Exception;
  //获取所有用户（模糊搜）
    BaseResp findAll(String search, Long id,int page,int pageSize)throws Exception;
}
