package com.practice.community.dao;

import com.practice.community.CommunityApplication;
import com.practice.community.entity.DiscussPost;
import com.practice.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

/**
 * @Author: Victor
 * @Date: 2020/3/4 13:20
 */

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class UserMapperTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser() {
        User user = userMapper.selectById(101);
        System.out.println(user);
        user = userMapper.selectByName("liubei");
        System.out.println(user);

    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setUsername("112");
        user.setPassword("11");
        user.setSalt("11");
        user.setEmail("11@11.com");
        user.setHeaderUrl("11@11.com");

        int row = userMapper.insertUser(user);
        System.out.println(row);
        System.out.println(user.getId());

    }

    @Test
    public void testUpdate() {
        int row = userMapper.updateHeader(150, "http://1.1.1.1/1.jpg");
        System.out.println(row);
        row = userMapper.updatePassword(150, "pass");
        System.out.println(row);
        row = userMapper.updateStatus(150, 1);
        System.out.println(row);
    }

    @Test
    public void testSelect() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost discussPost : list) {
            System.out.println(discussPost);
        }
        int rows = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(rows);
    }
}
