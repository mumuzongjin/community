package com.practice.community.dao;

import com.practice.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Victor
 * @Date: 2020/3/4 9:17
 * <p>
 * mybatis: only interface ,no implementation
 */
//@Repository
@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String name);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(@Param("id") int id, @Param("status") int status);

    int updateHeader(@Param("id") int id, @Param("headerUrl") String headerUrl);

    int updatePassword(@Param("id") int id, @Param("password") String password);


}
