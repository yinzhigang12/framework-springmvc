package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaItemParam;
import com.ajiatech.pojo.AjiaItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaItemParamMapper {
    long countByExample(AjiaItemParamExample example);

    int deleteByExample(AjiaItemParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AjiaItemParam record);

    int insertSelective(AjiaItemParam record);

    List<AjiaItemParam> selectByExampleWithBLOBs(AjiaItemParamExample example);

    List<AjiaItemParam> selectByExample(AjiaItemParamExample example);

    AjiaItemParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AjiaItemParam record, @Param("example") AjiaItemParamExample example);

    int updateByExampleWithBLOBs(@Param("record") AjiaItemParam record, @Param("example") AjiaItemParamExample example);

    int updateByExample(@Param("record") AjiaItemParam record, @Param("example") AjiaItemParamExample example);

    int updateByPrimaryKeySelective(AjiaItemParam record);

    int updateByPrimaryKeyWithBLOBs(AjiaItemParam record);

    int updateByPrimaryKey(AjiaItemParam record);
}