package com.neuedu.dao;

import com.neuedu.po.TabCollPost;
import com.neuedu.po.TabCollPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabCollPostMapper {
    long countByExample(TabCollPostExample example);

    int deleteByExample(TabCollPostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TabCollPost record);

    int insertSelective(TabCollPost record);

    List<TabCollPost> selectByExample(TabCollPostExample example);

    TabCollPost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TabCollPost record, @Param("example") TabCollPostExample example);

    int updateByExample(@Param("record") TabCollPost record, @Param("example") TabCollPostExample example);

    int updateByPrimaryKeySelective(TabCollPost record);

    int updateByPrimaryKey(TabCollPost record);
}