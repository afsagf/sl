package com.sy.service.wzx;

import com.sy.exception.SLException;
import com.sy.model.Affiche;

import java.util.List;

public interface AfficheService {

    //插入
    boolean create(Long id,Affiche affiche) throws SLException;

    //更新
    boolean modify(Affiche affiche) throws SLException;

    //删除
    boolean remove(Long id);

    //查看 管理员
    List<Affiche> getByAid(Long id);

    //查看 用户
    List<Affiche> getAll();

    //公告详情
    Affiche getById(Long id);

}
