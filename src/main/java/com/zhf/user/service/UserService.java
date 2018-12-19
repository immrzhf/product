package com.zhf.user.service;


import com.zhf.user.entity.User;

import java.util.List;

/**
 * Created by zhaohongfei
 * 2018/10/16 11:06
 */
public interface UserService {

    User getUserByInfo(String name, String password);
}
