package com.sy.service.wzx;

import com.sy.exception.SLException;
import com.sy.model.Au_user;

public interface Au_userService2 {

    boolean verify(Au_user user) throws SLException;

    boolean create(Au_user user, Long id) throws SLException;

    boolean modify(Au_user user) throws SLException;

    boolean remove(Long id) throws SLException;

    boolean modifyLoginPwd(Long id, String oldPwd, String newPwd, String newPwd2) throws SLException;

    boolean modifySecondPwd(Long id, String oldPwd, String newPwd, String newPwd2) throws SLException;
}
