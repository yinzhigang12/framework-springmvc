package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaItemParamItem;
import com.ajiatech.pojo.AjiaItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaItemParamItemMapper {
    long countByExample(AjiaItemParamItemExample example);

    int deleteByExample(AjiaItemParamItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AjiaItemParamItem record);

    int insertSelective(AjiaItemParamItem record);

    List<AjiaItemParamItem> selectByExampleWithBLOBs(AjiaItemParamItemExample example);

    List<AjiaItemParamItem> selectByExample(AjiaItemParamItemExample example);

    AjiaItemParamItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AjiaItemParamItem record, @Param("example") AjiaItemParamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") AjiaItemParamItem record, @Param("example") AjiaItemParamItemExample example);

    int updateByExample(@Param("record") AjiaItemParamItem record, @Param("example") AjiaItemParamItemExample example);

    int updateByPrimaryKeySelective(AjiaItemParamItem record);

    int updateByPrimaryKeyWithBLOBs(AjiaItemParamItem record);

    int updateByPrimaryKey(AjiaItemParamItem record);
}