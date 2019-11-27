package com.neuedu.dao;

import com.neuedu.po.TabFlyKiss;
import com.neuedu.po.TabFlyKissExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabFlyKissMapper {
    long countByExample(TabFlyKissExample example);

    int deleteByExample(TabFlyKissExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TabFlyKiss record);

    int insertSelective(TabFlyKiss record);

    List<TabFlyKiss> selectByExample(TabFlyKissExample example);

    TabFlyKiss selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TabFlyKiss record, @Param("example") TabFlyKissExample example);

    int updateByExample(@Param("record") TabFlyKiss record, @Param("example") TabFlyKissExample example);

    int updateByPrimaryKeySelective(TabFlyKiss record);

    int updateByPrimaryKey(TabFlyKiss record);
}