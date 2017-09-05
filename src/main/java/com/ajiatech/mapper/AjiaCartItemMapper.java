package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaCartItem;
import com.ajiatech.pojo.AjiaCartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaCartItemMapper {
    long countByExample(AjiaCartItemExample example);

    int deleteByExample(AjiaCartItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AjiaCartItem record);

    int insertSelective(AjiaCartItem record);

    List<AjiaCartItem> selectByExample(AjiaCartItemExample example);

    AjiaCartItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AjiaCartItem record, @Param("example") AjiaCartItemExample example);

    int updateByExample(@Param("record") AjiaCartItem record, @Param("example") AjiaCartItemExample example);

    int updateByPrimaryKeySelective(AjiaCartItem record);

    int updateByPrimaryKey(AjiaCartItem record);
}