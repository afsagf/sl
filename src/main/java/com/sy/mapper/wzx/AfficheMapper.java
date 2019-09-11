package com.sy.mapper.wzx;

import com.sy.model.Affiche;

import java.util.List;

public interface AfficheMapper {

    //公告


    //插入
    Integer insert(Affiche affiche);

    //更新
    Integer update(Affiche affiche);

    //删除
    Integer delete(Long id);

    //查看 管理员
    List<Affiche> selectByAdmin(String loginCode);

    //查看 用户
    List<Affiche> selectAll();

    //修改时查看
    Affiche selectByAid(Long id);




}
