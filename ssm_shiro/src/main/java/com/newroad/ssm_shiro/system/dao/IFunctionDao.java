package com.newroad.ssm_shiro.system.dao;

import com.newroad.ssm_shiro.system.entity.Function;
import java.util.List;

public interface IFunctionDao {
    int deleteByPrimaryKey(Integer funcId);

    int insert(Function record);

    Function selectByPrimaryKey(Integer funcId);

    List<Function> selectAll();

    int updateByPrimaryKey(Function record);
}