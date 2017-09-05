package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaContentCategory;
import com.ajiatech.pojo.AjiaContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaContentCategoryMapper {
    long countByExample(AjiaContentCategoryExample example);

    int deleteByExample(AjiaContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AjiaContentCategory record);

    int insertSelective(AjiaContentCategory record);

    List<AjiaContentCategory> selectByExample(AjiaContentCategoryExample example);

    AjiaContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AjiaContentCategory record, @Param("example") AjiaContentCategoryExample example);

    int updateByExample(@Param("record") AjiaContentCategory record, @Param("example") AjiaContentCategoryExample example);

    int updateByPrimaryKeySelective(AjiaContentCategory record);

    int updateByPrimaryKey(AjiaContentCategory record);
}