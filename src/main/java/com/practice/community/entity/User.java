package com.practice.community.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: Victor
 * @Date: 2020/3/4 9:12
 */
@Getter
@Setter
@ToString
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private String activationCode;
    private String headerUrl;
    private int type;
    private int status;
    private Date createTime;

}
