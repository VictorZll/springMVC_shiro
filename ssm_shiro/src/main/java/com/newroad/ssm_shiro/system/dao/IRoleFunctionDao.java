package com.newroad.ssm_shiro.system.dao;

import com.newroad.ssm_shiro.system.entity.RoleFunction;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IRoleFunctionDao {
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("funcId") Integer funcId);

    int insert(RoleFunction record);

    List<RoleFunction> selectAll();
}