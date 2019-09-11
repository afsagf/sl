package com.sy.service.wzx.impl;

import com.sy.exception.SLException;
import com.sy.mapper.wzx.Au_userMapper2;
import com.sy.model.Au_user;
import com.sy.service.wzx.Au_userService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class Au_userService2Impl implements Au_userService2 {

    @Autowired
    private Au_userMapper2 userMapper;

    @Autowired
    private Au_userService2 au_userService2;

    /**
     * 用户信息验证
     *
     * @param user
     * @return
     */
    public boolean verify(Au_user user) throws SLException {
        if (user.getLoginCode() == null || "".equals(user.getLoginCode())) {
            throw new SLException("请输入用户名");
        } else {
            if (userMapper.selectByUser(user) != null) {
                if (user.getUserName() == null || "".equals(user.getUserName())
                        || user.getSex() == null || "".equals(user.getSex())
                        || user.getBirthday() == null
                        || user.getCardType() == null || "".equals(user.getCardType())
                        || user.getIdCard() == null || "".equals(user.getIdCard())
                        || user.getCountry() == null || "".equals(user.getCountry())
                        || user.getMobile() == null || "".equals(user.getMobile())
                        || user.getEmail() == null || "".equals(user.getEmail())
                        || user.getUserAddress() == null || "".equals(user.getUserAddress())
                        || user.getPostCode() == null || "".equals(user.getPostCode())
                        || user.getCreateTime() == null
                        || user.getReferId() == null
                        || user.getReferCode() == null || "".equals(user.getReferCode())
                        || user.getRoleId() == null
                        || user.getRoleName() == null || "".equals(user.getRoleName())
                        || user.getUserType() == null || "".equals(user.getUserType())
                        || user.getUserTypeName() == null || "".equals(user.getUserTypeName())
                        || user.getBankAccount() == null || "".equals(user.getBankAccount())
                        || user.getBankName() == null || "".equals(user.getBankName())
                        || user.getAccountHolder() == null || "".equals(user.getAccountHolder())
                        || user.getIdCardPicPath() == null || "".equals(user.getIdCardPicPath())
                        || user.getBankPicPath() == null || "".equals(user.getBankPicPath())
                ) {
                    throw new SLException("请输入完整信息");
                } else {
                    //正则校验 长度校验
                    //todo
                    //验证通过
                    return true;
                }


            } else {
                throw new SLException("该用户名已注册");
            }
        }

    }

    /**
     * 创建注册会员
     * 适用于注册会员
     *
     * @param user
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean create(Au_user user, Long id) throws SLException {
        Integer i = null;
        boolean b = au_userService2.verify(user);
        if (b) {
            String pwd = user.getIdCard().substring(user.getIdCard().length() - 6, user.getIdCard().length());
            user.setPassword(pwd);
            user.setPassword2(pwd);
            //set关联注册人
            Au_user user1 = userMapper.selectById(id);
            user.setReferId(user1.getId());
            user.setReferCode(user1.getReferCode());
            //set角色
            user.setRoleId(2L);
            user.setRoleName("会员");
            user.setUserType("1");
            user.setUserTypeName("注册会员");
            user.setIsStart(1);
            i = userMapper.insert(user);
        }
        return i > 0;
    }


    /**
     * 修改用户信息 适用于所有类型用户
     *
     * @param user
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean modify(Au_user user) throws SLException {
        Integer i = null;
        boolean b = au_userService2.verify(user);
        if (b) {
            i = userMapper.updateByUser(user);
        }
        return i > 0;
    }

    /**
     * 删除注册会员
     *
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean remove(Long id) throws SLException {
        if (userMapper.selectById(id) != null) {
            return userMapper.deleteById(id) > 0;
        } else {
            throw new SLException("该用户不存在");
        }
    }

    /**
     * 修改登录密码
     *
     * @param id
     * @param oldPwd
     * @param newPwd
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean modifyLoginPwd(Long id, String oldPwd, String newPwd, String newPwd2) throws SLException {
        Au_user user = userMapper.selectById(id);
        if (user != null) {
            if (oldPwd.equals(user.getPassword())) {
                if ("".equals(newPwd) || newPwd == null || "".equals(newPwd2) || newPwd2 == null) {
                    throw new SLException("请输入新密码");
                } else {
                    if (newPwd.equals(newPwd2)) {
                        return userMapper.updateLoginPwd(id, newPwd) > 0;
                    } else {
                        throw new SLException("确认密码不正确");
                    }
                }
            } else {
                throw new SLException("旧密码输入不正确,初始密码为证件号后6位");
            }
        } else {
            throw new SLException("该用户不存在");
        }
    }

    /**
     * 修改二级密码
     *
     * @param id
     * @param oldPwd
     * @param newPwd
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean modifySecondPwd(Long id, String oldPwd, String newPwd, String newPwd2) throws SLException {
        Au_user user = userMapper.selectById(id);
        if (user != null) {
            if (oldPwd.equals(user.getPassword2())) {
                if ("".equals(newPwd) || newPwd == null || "".equals(newPwd2) || newPwd2 == null) {
                    throw new SLException("请输入新密码");
                } else {
                    if (newPwd.equals(newPwd2)) {
                        return userMapper.updateSecondPwd(id, newPwd) > 0;
                    } else {
                        throw new SLException("确认密码不正确");
                    }
                }
            } else {
                throw new SLException("旧密码输入不正确,初始密码为证件号后6位");
            }
        } else {
            throw new SLException("该用户不存在");
        }
    }


}
