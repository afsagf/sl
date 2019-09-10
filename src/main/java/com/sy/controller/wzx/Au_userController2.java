package com.sy.controller.wzx;

import com.sy.model.Au_user;
import com.sy.model.resp.BaseResp;
import com.sy.service.wzx.Au_userService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

@RestController
public class Au_userController2 {

    @Autowired
    private Au_userService2 userService;

    /**
     * 注册新会员
     */
    @RequestMapping(value = "createNew", method = RequestMethod.POST)
    public BaseResp createNew(MultipartFile file, Au_user user, HttpServletResponse response) {

        BaseResp resp = new BaseResp();


        return resp;

    }


}
