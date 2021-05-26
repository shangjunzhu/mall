package com.macro.mall.mapper;

import com.macro.mall.model.CgProjectInfo;
import com.macro.mall.model.CgProjectInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgProjectInfoMapper {
    long countByExample(CgProjectInfoExample example);

    int deleteByExample(CgProjectInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CgProjectInfo record);

    int insertSelective(CgProjectInfo record);

    List<CgProjectInfo> selectByExample(CgProjectInfoExample example);

    CgProjectInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CgProjectInfo record, @Param("example") CgProjectInfoExample example);

    int updateByExample(@Param("record") CgProjectInfo record, @Param("example") CgProjectInfoExample example);

    int updateByPrimaryKeySelective(CgProjectInfo record);

    int updateByPrimaryKey(CgProjectInfo record);
}