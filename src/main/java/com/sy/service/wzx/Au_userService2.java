package com.sy.service.wzx;

import com.sy.model.Au_user;

public interface Au_userService2 {

    boolean verify(Au_user user);

    boolean create(Au_user user);

    boolean modify(Au_user user);

    boolean remove(Integer id);

}
