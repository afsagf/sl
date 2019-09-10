package com.sy.mapper.wzx;

import com.sy.model.Information;

import java.util.List;

public interface InformationMapper {

    //资讯

    //插入
    Integer insert(Information information);

    //更新
    Integer update(Information information);

    //删除
    Integer delete(Integer id);

    //查看 管理员
    List<Information> selectById(Integer id);

    //查看 用户
    List<Information> selectAll();


}
