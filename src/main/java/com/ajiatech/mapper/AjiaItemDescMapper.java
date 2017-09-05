package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaItemDesc;
import com.ajiatech.pojo.AjiaItemDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaItemDescMapper {
    long countByExample(AjiaItemDescExample example);

    int deleteByExample(AjiaItemDescExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(AjiaItemDesc record);

    int insertSelective(AjiaItemDesc record);

    List<AjiaItemDesc> selectByExampleWithBLOBs(AjiaItemDescExample example);

    List<AjiaItemDesc> selectByExample(AjiaItemDescExample example);

    AjiaItemDesc selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") AjiaItemDesc record, @Param("example") AjiaItemDescExample example);

    int updateByExampleWithBLOBs(@Param("record") AjiaItemDesc record, @Param("example") AjiaItemDescExample example);

    int updateByExample(@Param("record") AjiaItemDesc record, @Param("example") AjiaItemDescExample example);

    int updateByPrimaryKeySelective(AjiaItemDesc record);

    int updateByPrimaryKeyWithBLOBs(AjiaItemDesc record);

    int updateByPrimaryKey(AjiaItemDesc record);
}