package com.practice.community.service;

import com.practice.community.dao.DiscussPostMapper;
import com.practice.community.dao.UserMapper;
import com.practice.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Victor
 * @Date: 2020/3/5 13:56
 */
@Service
public class DiscussPostServiceImpl implements DiscussPostService {
    @Autowired
    DiscussPostMapper discussPostMapper;
    @Autowired
    UserMapper userMapper;

    @Override
    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    @Override
    public int findDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
