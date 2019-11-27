package com.neuedu.dao;

import com.neuedu.po.TabSex;
import com.neuedu.po.TabSexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabSexMapper {
    long countByExample(TabSexExample example);

    int deleteByExample(TabSexExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TabSex record);

    int insertSelective(TabSex record);

    List<TabSex> selectByExample(TabSexExample example);

    TabSex selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TabSex record, @Param("example") TabSexExample example);

    int updateByExample(@Param("record") TabSex record, @Param("example") TabSexExample example);

    int updateByPrimaryKeySelective(TabSex record);

    int updateByPrimaryKey(TabSex record);
}