package com.practice.community.service;

import com.practice.community.entity.DiscussPost;

import java.util.List;

/**
 * @Author: Victor
 * @Date: 2020/3/5 13:47
 */
public interface DiscussPostService {
    List<DiscussPost> findDiscussPosts(int userId, int offset, int limit);

    int findDiscussPostRows(int userId);
}
