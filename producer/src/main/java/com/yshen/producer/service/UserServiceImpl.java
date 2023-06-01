package com.yshen.producer.service;

import com.yshen.common.entry.User;
import com.yshen.common.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author: zhengyuekai
 * @CreateTime: 2023/5/31 15:56
 * @Description:
 */
@DubboService(group = "group1", version = "1.0")
public class UserServiceImpl implements UserService {


    @Override
    public User getUser(String name) {

        User user = new User();
        user.setAge(888);
        user.setName(name + "_hello");
        return user;
    }
}
