package com.sy.service.ggy;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sy.mapper.ggy.Au_userMapper;
import com.sy.model.Au_user;
import com.sy.model.resp.BaseResp;
import com.sy.model.resp.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class Au_userServiceImpl implements Au_userService {
    @Autowired
    Au_userMapper au_userMapper;

    @Override
    public BaseResp login(Au_user au_user) throws Exception {
        BaseResp baseResp = new BaseResp();
        List<String> loginCodes = au_userMapper.selectAllUsername();
        if (loginCodes.contains(au_user.getLoginCode())) {
            Au_user au_user1 = au_userMapper.selectUserByLoginCodeAndPassWord(au_user);
            if (au_user1 != null) {
                baseResp.setSuccess(Constant.SUCCESS);
                baseResp.setErrorMsg("登录成功！");
                baseResp.setData(au_user1);

            } else {
                baseResp.setSuccess(Constant.ERROR);
                baseResp.setErrorMsg("密码错误,请重新输入！");
            }
        } else {
            baseResp.setSuccess(Constant.ERROR);
            baseResp.setErrorMsg("用户名错误,请重新输入！");
        }
        return baseResp;
    }

    @Override
    public Au_user findById(Long id) throws Exception {
        return au_userMapper.selectUserByID(id);
    }

    @Override
    public BaseResp findAll(String search, Long id, int page, int pageSize) throws Exception {
        BaseResp baseResp = new BaseResp();
        search = "%" + search + "%";
        if (page <= 1) {
            page = 1;
        }
        PageHelper.startPage(page, pageSize);
        List<Au_user> au_userList = au_userMapper.selectAll(search, id);
        Page<Au_user> pageInfo = (Page<Au_user>) au_userList;
        Long count = pageInfo.getTotal();
        int totalPage = pageInfo.getPages();
        baseResp.setSuccess(Constant.SUCCESS);
        baseResp.setErrorMsg("获取成功");
        baseResp.setData(au_userList);
        baseResp.setCount(count);
        baseResp.setPage(totalPage);
        return baseResp;
    }
}
