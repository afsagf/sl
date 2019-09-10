package com.sy.service.wzx;

import com.sy.model.Information;

import java.util.List;

public interface InformationService {

    //插入
    Integer create(Information information);

    //更新
    Integer modify(Information information);

    //删除
    Integer remove(Integer id);

    //查看 管理员
    List<Information> getById(Integer id);

    //查看 用户
    List<Information> getAll();

}
