package com.neuedu.dao;

import com.neuedu.po.TabPost;
import com.neuedu.po.TabPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabPostMapper {
    long countByExample(TabPostExample example);

    int deleteByExample(TabPostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TabPost record);

    int insertSelective(TabPost record);

    List<TabPost> selectByExampleWithBLOBs(TabPostExample example);

    List<TabPost> selectByExample(TabPostExample example);

    TabPost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TabPost record, @Param("example") TabPostExample example);

    int updateByExampleWithBLOBs(@Param("record") TabPost record, @Param("example") TabPostExample example);

    int updateByExample(@Param("record") TabPost record, @Param("example") TabPostExample example);

    int updateByPrimaryKeySelective(TabPost record);

    int updateByPrimaryKeyWithBLOBs(TabPost record);

    int updateByPrimaryKey(TabPost record);
}