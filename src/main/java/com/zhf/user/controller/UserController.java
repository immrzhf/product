package com.zhf.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhf.user.entity.User;
import com.zhf.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@EnableAutoConfiguration
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login/{name}/{password}")
    public Object saveGoods(@PathVariable("name") String name,@PathVariable("password") String password){
        JSONObject result = new JSONObject();
        result.put("success",true);
        try{
            User user = userService.getUserByInfo(name,password);
            result.put("data",user);
        }catch (Exception e){
            e.printStackTrace();
            result.put("success",false);
        }
        return result;
    }


}
