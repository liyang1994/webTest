package com.ly.controller;
import com.ly.mapper.UserMapper;
import com.ly.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userMapper.insert(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all")
    /*@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize*/
    public Object findAllUser(){
        List<User> list = new ArrayList<User>();
        return userMapper.selectAllUser();
    }
}