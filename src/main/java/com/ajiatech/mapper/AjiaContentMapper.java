package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaContent;
import com.ajiatech.pojo.AjiaContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaContentMapper {
    long countByExample(AjiaContentExample example);

    int deleteByExample(AjiaContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AjiaContent record);

    int insertSelective(AjiaContent record);

    List<AjiaContent> selectByExampleWithBLOBs(AjiaContentExample example);

    List<AjiaContent> selectByExample(AjiaContentExample example);

    AjiaContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AjiaContent record, @Param("example") AjiaContentExample example);

    int updateByExampleWithBLOBs(@Param("record") AjiaContent record, @Param("example") AjiaContentExample example);

    int updateByExample(@Param("record") AjiaContent record, @Param("example") AjiaContentExample example);

    int updateByPrimaryKeySelective(AjiaContent record);

    int updateByPrimaryKeyWithBLOBs(AjiaContent record);

    int updateByPrimaryKey(AjiaContent record);
}