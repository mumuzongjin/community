package com.practice.community.service;

import com.practice.community.dao.UserMapper;
import com.practice.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Victor
 * @Date: 2020/3/5 14:11
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
