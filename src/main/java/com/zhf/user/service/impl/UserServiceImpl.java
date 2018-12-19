package com.zhf.user.service.impl;

import com.zhf.user.entity.User;
import com.zhf.user.repository.UserRepository;
import com.zhf.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhaohongfei
 * 2018/10/16 11:07
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;


    @Override
    public User getUserByInfo(String name, String passwrod) {
        return userRepository.getUserByInfo(name,passwrod);
    }
}
