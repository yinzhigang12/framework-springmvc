package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaOrderItem;
import com.ajiatech.pojo.AjiaOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaOrderItemMapper {
    long countByExample(AjiaOrderItemExample example);

    int deleteByExample(AjiaOrderItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(AjiaOrderItem record);

    int insertSelective(AjiaOrderItem record);

    List<AjiaOrderItem> selectByExample(AjiaOrderItemExample example);

    AjiaOrderItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AjiaOrderItem record, @Param("example") AjiaOrderItemExample example);

    int updateByExample(@Param("record") AjiaOrderItem record, @Param("example") AjiaOrderItemExample example);

    int updateByPrimaryKeySelective(AjiaOrderItem record);

    int updateByPrimaryKey(AjiaOrderItem record);
}