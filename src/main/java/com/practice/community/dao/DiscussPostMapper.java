package com.practice.community.dao;

import com.practice.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Victor
 * @Date: 2020/3/4 21:01
 */

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId, @Param("offset") int offset, @Param("limit") int limit);

    int selectDiscussPostRows(@Param("userId") int userId);


}
