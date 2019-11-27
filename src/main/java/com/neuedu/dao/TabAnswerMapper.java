package com.neuedu.dao;

import com.neuedu.po.TabAnswer;
import com.neuedu.po.TabAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabAnswerMapper {
    long countByExample(TabAnswerExample example);

    int deleteByExample(TabAnswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TabAnswer record);

    int insertSelective(TabAnswer record);

    List<TabAnswer> selectByExample(TabAnswerExample example);

    TabAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TabAnswer record, @Param("example") TabAnswerExample example);

    int updateByExample(@Param("record") TabAnswer record, @Param("example") TabAnswerExample example);

    int updateByPrimaryKeySelective(TabAnswer record);

    int updateByPrimaryKey(TabAnswer record);
}