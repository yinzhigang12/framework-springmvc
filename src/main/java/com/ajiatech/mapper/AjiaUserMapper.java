package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaUser;
import com.ajiatech.pojo.AjiaUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaUserMapper {
    long countByExample(AjiaUserExample example);

    int deleteByExample(AjiaUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AjiaUser record);

    int insertSelective(AjiaUser record);

    List<AjiaUser> selectByExample(AjiaUserExample example);

    AjiaUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AjiaUser record, @Param("example") AjiaUserExample example);

    int updateByExample(@Param("record") AjiaUser record, @Param("example") AjiaUserExample example);

    int updateByPrimaryKeySelective(AjiaUser record);

    int updateByPrimaryKey(AjiaUser record);
}