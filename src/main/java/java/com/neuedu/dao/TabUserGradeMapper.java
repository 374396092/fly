package com.neuedu.dao;

import com.neuedu.po.TabUserGrade;
import com.neuedu.po.TabUserGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabUserGradeMapper {
    long countByExample(TabUserGradeExample example);

    int deleteByExample(TabUserGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TabUserGrade record);

    int insertSelective(TabUserGrade record);

    List<TabUserGrade> selectByExample(TabUserGradeExample example);

    TabUserGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TabUserGrade record, @Param("example") TabUserGradeExample example);

    int updateByExample(@Param("record") TabUserGrade record, @Param("example") TabUserGradeExample example);

    int updateByPrimaryKeySelective(TabUserGrade record);

    int updateByPrimaryKey(TabUserGrade record);
}