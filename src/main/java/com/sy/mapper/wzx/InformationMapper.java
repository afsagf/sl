package com.sy.mapper.wzx;

import com.sy.model.Information;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InformationMapper {

    //资讯

    //插入
    Integer insert(Information information);

    //更新
    Integer update(Information information);

    //删除
    Integer delete(Long id);

    //查看 管理员
    List<Information> selectByPid(Long id);

    //查看 用户
    List<Information> selectAll();

    //发布状态修改
    Integer updateState(@Param("id") Long id, @Param("state") Integer state);

    //检查发布状态
    Integer selectStateById(Long id);

    //资讯详情
    Information selectById(Long id);


}
