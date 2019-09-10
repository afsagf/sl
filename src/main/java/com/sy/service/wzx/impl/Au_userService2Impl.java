package com.sy.service.wzx.impl;

import com.sy.mapper.wzx.Au_userMapper2;
import com.sy.model.Au_user;
import com.sy.service.wzx.Au_userService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("wzxService")
public class Au_userService2Impl implements Au_userService2 {

    @Autowired
    private Au_userMapper2 userMapper;

    /**
     * 用户信息验证
     *
     * @param user
     * @return
     */
    public boolean verify(Au_user user) {
        return false;
    }

    /**
     * 创建注册会员
     * 适用于注册会员
     *
     * @param user
     * @return
     */
    public boolean create(Au_user user) {
        return false;
    }

    /**
     * 修改用户信息 适用于所有类型用户
     *
     * @param user
     * @return
     */
    public boolean modify(Au_user user) {
        return false;
    }

    /**
     * 删除注册会员
     *
     * @param id
     * @return
     */
    public boolean remove(Integer id) {
        return false;
    }

    /**
     * 修改登录密码
     * @param id
     * @param pwd
     * @return
     */
    public boolean modifyLoginPwd(Integer id, String pwd) {
        return false;
    }

    /**
     * 修改二级密码
     * @param id
     * @param pwd
     * @return
     */
    public boolean modifySecondPwd(Integer id, String pwd) {
        return false;
    }


}
