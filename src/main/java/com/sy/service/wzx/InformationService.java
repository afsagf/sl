package com.sy.service.wzx;

import com.sy.exception.SLException;
import com.sy.model.Information;

import java.util.List;

public interface InformationService {

    //验证
    boolean verify(Information information) throws SLException;

    //插入
    boolean create(Long id,Information information) throws SLException;

    //更新
    boolean modify(Information information) throws SLException;

    //删除
    boolean remove(Long id);

    //查看 管理员
    List<Information> getByAid(Long id);

    //查看 用户
    List<Information> getAll();

    //检查发布状态
    boolean modifyState(Long id);

    //资讯详情
    Information getById(Long id);

}
