package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaShipping;
import com.ajiatech.pojo.AjiaShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaShippingMapper {
    long countByExample(AjiaShippingExample example);

    int deleteByExample(AjiaShippingExample example);

    int deleteByPrimaryKey(Long addId);

    int insert(AjiaShipping record);

    int insertSelective(AjiaShipping record);

    List<AjiaShipping> selectByExample(AjiaShippingExample example);

    AjiaShipping selectByPrimaryKey(Long addId);

    int updateByExampleSelective(@Param("record") AjiaShipping record, @Param("example") AjiaShippingExample example);

    int updateByExample(@Param("record") AjiaShipping record, @Param("example") AjiaShippingExample example);

    int updateByPrimaryKeySelective(AjiaShipping record);

    int updateByPrimaryKey(AjiaShipping record);
}