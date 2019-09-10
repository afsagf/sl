package com.sy.mapper.ggy;

import com.sy.model.Au_function;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Au_functionMapper {
    //根据登录用户roleId获取用户权限functionId在和菜单parentId同时获取Au_function
    List<Au_function> selectByIdAndparentId(@Param("roleId") Long roleId,@Param("parentId") Long parentId);
}
