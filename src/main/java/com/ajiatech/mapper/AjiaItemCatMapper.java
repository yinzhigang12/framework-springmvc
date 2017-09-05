package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaItemCat;
import com.ajiatech.pojo.AjiaItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaItemCatMapper {
    long countByExample(AjiaItemCatExample example);

    int deleteByExample(AjiaItemCatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AjiaItemCat record);

    int insertSelective(AjiaItemCat record);

    List<AjiaItemCat> selectByExample(AjiaItemCatExample example);

    AjiaItemCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AjiaItemCat record, @Param("example") AjiaItemCatExample example);

    int updateByExample(@Param("record") AjiaItemCat record, @Param("example") AjiaItemCatExample example);

    int updateByPrimaryKeySelective(AjiaItemCat record);

    int updateByPrimaryKey(AjiaItemCat record);
}