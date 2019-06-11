package com.newroad.ssm_shiro.system.dao;

import com.newroad.ssm_shiro.system.entity.Role;
import java.util.List;

public interface IRoleDao {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    Role selectByPrimaryKey(Integer roleId);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}