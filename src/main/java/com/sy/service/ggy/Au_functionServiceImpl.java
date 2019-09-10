package com.sy.service.ggy;

import com.alibaba.fastjson.JSON;
import com.sy.mapper.ggy.Au_functionMapper;
import com.sy.model.Au_function;
import com.sy.model.resp.Constant;
import com.sy.tools.RedisAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Au_functionServiceImpl implements Au_functionService {
    @Autowired
    Au_functionMapper au_functionMapper;
    @Autowired
    private RedisAPI redisAPI;
    //根据登录用户roleId获取用户权限functionId在和菜单parentId同时获取Au_function
    @Override
    public String findByIdAndparentId(Long roleId) throws Exception {
        String key= Constant.MENUS+roleId;
        String json=null;
        if(redisAPI.exist(key)){
          json=redisAPI.get(key);
        }else {
            //获取一级列表
            List<Au_function> fistLevel=au_functionMapper.selectByIdAndparentId(roleId,0l);
            for (Au_function au_function:fistLevel){
                List<Au_function> secLevel=au_functionMapper.selectByIdAndparentId(roleId,au_function.getId());
                au_function.setSecAuFunction(secLevel);
            }
           json= JSON.toJSONString(fistLevel);
            redisAPI.set(key,json);
        }
        return json;
    }
}
