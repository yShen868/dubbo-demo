package com.yshen.common.service;

import com.yshen.common.entry.User;

/**
 * @Author: zhengyuekai
 * @CreateTime: 2023/5/31 15:53
 * @Description:
 */
public interface UserService {


    /**
     * 根据姓名获取user
     *
     * @param name name
     * @return user
     */
    User getUser(String name);


}
