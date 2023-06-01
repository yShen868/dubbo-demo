package com.yshen.consumer.config;

import com.yshen.common.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class DubboBean {
    @DubboReference(group = "group1", version = "1.0")
    private UserService userService;


}