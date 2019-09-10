package com.sy.mapper.wzx;

import com.sy.model.Au_user;

public interface Au_userMapper2 {

    //插入
    Integer insert(Au_user user);

    //验证是否存在 根据用户名或身份证号判断用户是否存在 动态sql
    Integer selectByUser(Au_user user);

    //更新用户信息 用于所有类型
    Integer updateByUser(Au_user user);

    //删除用户
    Integer deleteById(Integer id);

    //修改登录密码
    Integer updateLoginPwd(Integer id, String pwd);

    //修改二级密码
    Integer updateSecondPwd(Integer id, String pwd);

    //验证登录密码
    //验证二级密码
    //通过session比对验证


}
