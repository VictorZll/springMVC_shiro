package com.newroad.ssm_shiro.system.dao;

import com.newroad.ssm_shiro.system.entity.User;
import java.util.List;

public interface IUserDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    User selectByPrimaryKey(Integer userId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
    
    User selectByUsername(String username);
}