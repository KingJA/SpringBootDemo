package com.kingja.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description：TODO
 * Create Time：2017/12/6 16:55
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
@Controller
//@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login() {
        return "login";

    }


}
