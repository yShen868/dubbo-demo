package com.yshen.consumer.controller;

import com.yshen.common.entry.User;
import com.yshen.common.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: zhengyuekai
 * @CreateTime: 2023/5/31 15:59
 * @Description:
 */

@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser(@RequestParam("name") String name) {
        return userService.getUser(name);

    }


}
