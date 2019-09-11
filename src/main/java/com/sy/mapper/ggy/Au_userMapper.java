package com.sy.mapper.ggy;

import com.sy.model.Au_user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Au_userMapper {
    //获取所有用户姓名
    List<String> selectAllUsername();
    //根据用户名和密码获取用户
    Au_user selectUserByLoginCodeAndPassWord(Au_user au_user);
    //根据用户ID查询用户
    Au_user selectUserByID(Long id);
    //查询所有用户除了登入者
    List<Au_user> selectAll(@Param("search") String search,@Param("id") Long id);
    //更新用户状态
    void updateUserstate(Au_user au_user);
}
