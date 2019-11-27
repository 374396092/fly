package com.neuedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neuedu.po.TabUser;
import com.neuedu.po.TabUserExample;

public interface TabUserMapper {
    long countByExample(TabUserExample example);

    int deleteByExample(TabUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TabUser record);

    int insertSelective(TabUser record);

    List<TabUser> selectByExample(TabUserExample example);

    TabUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TabUser record, @Param("example") TabUserExample example);

    int updateByExample(@Param("record") TabUser record, @Param("example") TabUserExample example);

    int updateByPrimaryKeySelective(TabUser record);

    int updateByPrimaryKey(TabUser record);
    TabUser login(TabUser tabUser);
}