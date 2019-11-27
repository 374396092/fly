package com.neuedu.dao;

import com.neuedu.po.TabArea;
import com.neuedu.po.TabAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabAreaMapper {
    long countByExample(TabAreaExample example);

    int deleteByExample(TabAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TabArea record);

    int insertSelective(TabArea record);

    List<TabArea> selectByExample(TabAreaExample example);

    TabArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TabArea record, @Param("example") TabAreaExample example);

    int updateByExample(@Param("record") TabArea record, @Param("example") TabAreaExample example);

    int updateByPrimaryKeySelective(TabArea record);

    int updateByPrimaryKey(TabArea record);
}