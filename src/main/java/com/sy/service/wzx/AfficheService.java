package com.sy.service.wzx;

import com.sy.model.Affiche;

import java.util.List;

public interface AfficheService {

    //插入
    Integer create(Affiche affiche);

    //更新
    Integer modify(Affiche affiche);

    //删除
    Integer remove(Integer id);

    //查看 管理员
    List<Affiche> getById(Integer id);

    //查看 用户
    List<Affiche> getAll();

}
