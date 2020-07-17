package com.wxf.sc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhuzhiguang
 * @since 2020-07-16
 */
@RestController
@RequestMapping("/brand2")
public class Brand2Controller {

    @RequestMapping("a")
    public String a() {
        return "aaa";
    }

    @RequestMapping("b")
    public String b() {
        return "bbb";
    }
}
