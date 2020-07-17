package com.wxf.sc.controller;

import com.wxf.sc.entity.User;
import com.wxf.sc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("getuser")
    public  String getUserNameById(@RequestParam(value = "uid",defaultValue = "") int id){
        return "111 usernma [" + id + "]";
    }

    @RequestMapping("testList")
    public List<String> gets(){

        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsanAAAA");
        list.add("lissiAAAA");
        return list;
    }

    //查询数据
    @RequestMapping("ulist")
    public List<User> getUserList(){

        List<User> userList = userService.selectList(null);
        return userList;
    }

    @RequestMapping("a")
    public String geta() {
        return "this is a";
    }

}
