package com.sy.controller.ggy;

import com.sy.model.Au_user;
import com.sy.model.resp.BaseResp;
import com.sy.model.resp.Constant;
import com.sy.service.ggy.Au_functionService;
import com.sy.service.ggy.Au_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Au_userController {
    @Autowired
    Au_userService au_userService;
    @Autowired
    Au_functionService au_functionService;
    //登录接口
    @RequestMapping(value = "/login" )
    public BaseResp login(Au_user au_user, HttpServletRequest request){
        BaseResp baseResp= new BaseResp();
        try {
            baseResp = au_userService.login(au_user);
            request.getSession().setAttribute("user",baseResp.getData());
        } catch (Exception e) {
            e.printStackTrace();
            baseResp.setSuccess(Constant.ERROR);
            baseResp.setErrorMsg("登入接口服务器错误！");
        }

        return baseResp;
    }
    //获取域session中登录者并且将权限列表带出
    @RequestMapping(value = "/getUser" )
    public BaseResp getUser( HttpServletRequest request){
        BaseResp baseResp= new BaseResp();
        Map<String,Object> map=new HashMap<>();
        try {
            Au_user au_user=(Au_user)request.getSession().getAttribute("user");
            Au_user au_user1=au_userService.findById(au_user.getId());
            String menuJson=au_functionService.findByIdAndparentId(au_user1.getRoleId());
            request.getSession().setAttribute("user",au_user1);
            baseResp.setSuccess(Constant.SUCCESS);
            baseResp.setErrorMsg("获取登录者成功！");
            map.put("user",au_user1);
            map.put("menuJson",menuJson);
            baseResp.setData(map);

        } catch (Exception e) {
            e.printStackTrace();
            baseResp.setSuccess(Constant.ERROR);
            baseResp.setErrorMsg("获取登录者接口服务器错误！");
        }
        return baseResp;
    }
    //注销
    @RequestMapping(value = "/regist" )
    public int regist( HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return Constant.SUCCESS;
    }
    //查询所有用户（模糊搜）
    @RequestMapping(value = "/findAll" )
    public BaseResp findAll(String search,int page,int pageSize,HttpServletRequest request){
        BaseResp baseResp=new BaseResp();
        Au_user au_user=(Au_user)request.getSession().getAttribute("user");
        try {
            baseResp=au_userService.findAll(search,au_user.getId(),page,pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            baseResp.setSuccess(Constant.ERROR);
            baseResp.setErrorMsg("服务器异常");
        }
        return baseResp;
    }
}
