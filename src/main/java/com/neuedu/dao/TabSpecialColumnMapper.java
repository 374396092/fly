package com.neuedu.dao;

import com.neuedu.po.TabSpecialColumn;
import com.neuedu.po.TabSpecialColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabSpecialColumnMapper {
    long countByExample(TabSpecialColumnExample example);

    int deleteByExample(TabSpecialColumnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TabSpecialColumn record);

    int insertSelective(TabSpecialColumn record);

    List<TabSpecialColumn> selectByExample(TabSpecialColumnExample example);

    TabSpecialColumn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TabSpecialColumn record, @Param("example") TabSpecialColumnExample example);

    int updateByExample(@Param("record") TabSpecialColumn record, @Param("example") TabSpecialColumnExample example);

    int updateByPrimaryKeySelective(TabSpecialColumn record);

    int updateByPrimaryKey(TabSpecialColumn record);
}