package com.newroad.ssm_shiro.system.dao;

import com.newroad.ssm_shiro.system.entity.UserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserRoleDao {
    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("roleId") Integer roleId);

    int insert(UserRole record);

    List<UserRole> selectAll();
}