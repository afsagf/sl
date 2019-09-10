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
    Integer delete(Integer id);

    //查看 管理员
    List<Affiche> selectById(Integer id);

    //查看 用户
    List<Affiche> selectAll();




}
