package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaItem;
import com.ajiatech.pojo.AjiaItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaItemMapper {
    long countByExample(AjiaItemExample example);

    int deleteByExample(AjiaItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AjiaItem record);

    int insertSelective(AjiaItem record);

    List<AjiaItem> selectByExample(AjiaItemExample example);

    AjiaItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AjiaItem record, @Param("example") AjiaItemExample example);

    int updateByExample(@Param("record") AjiaItem record, @Param("example") AjiaItemExample example);

    int updateByPrimaryKeySelective(AjiaItem record);

    int updateByPrimaryKey(AjiaItem record);
}