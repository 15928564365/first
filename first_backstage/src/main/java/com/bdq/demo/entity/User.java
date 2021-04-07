package com.bdq.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description:
 * @Author: bdq
 * @Date: 17:25 2021/4/6
 */
@Data
@AllArgsConstructor
public class User {
    private Integer id;

    private String name;

    private String password;

}
