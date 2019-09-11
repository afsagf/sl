package com.sy.mapper.wzx;

import com.sy.model.Au_user;

import java.util.List;

public interface Au_userMapper2 {

    //插入
    Integer insert(Au_user user);

    //验证是否存在 根据用户名判断用户是否存在
    Au_user selectByUser(Au_user user);

    //更新用户信息 用于所有类型
    Integer updateByUser(Au_user user);

    //删除用户
    Integer deleteById(Long id);

    //修改登录密码
    Integer updateLoginPwd(Long id, String pwd);

    //修改二级密码
    Integer updateSecondPwd(Long id, String pwd);

    //模糊搜索
    List<Au_user> selectBySearch(String str);

    //验证登录密码
    //验证二级密码
    //通过selectById比对验证

    //查看当前用户
    Au_user selectById(Long id);



}
