package com.yshen.common.entry;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: zhengyuekai
 * @CreateTime: 2023/5/31 15:52
 * @Description:
 */
@Data
public class User implements Serializable {


    private String name;

    private Integer age;
}
