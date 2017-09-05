package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaOrder;
import com.ajiatech.pojo.AjiaOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaOrderMapper {
    long countByExample(AjiaOrderExample example);

    int deleteByExample(AjiaOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(AjiaOrder record);

    int insertSelective(AjiaOrder record);

    List<AjiaOrder> selectByExample(AjiaOrderExample example);

    AjiaOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") AjiaOrder record, @Param("example") AjiaOrderExample example);

    int updateByExample(@Param("record") AjiaOrder record, @Param("example") AjiaOrderExample example);

    int updateByPrimaryKeySelective(AjiaOrder record);

    int updateByPrimaryKey(AjiaOrder record);
}