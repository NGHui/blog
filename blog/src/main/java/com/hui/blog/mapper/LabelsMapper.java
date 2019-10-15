package com.hui.blog.mapper;

import com.hui.blog.bean.Labels;
import com.hui.blog.bean.LabelsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LabelsMapper {
    int countByExample(LabelsExample example);

    int deleteByExample(LabelsExample example);

    int deleteByPrimaryKey(Long labelId);

    int insert(Labels record);

    int insertSelective(Labels record);

    List<Labels> selectByExampleWithBLOBs(LabelsExample example);

    List<Labels> selectByExample(LabelsExample example);

    Labels selectByPrimaryKey(Long labelId);

    int updateByExampleSelective(@Param("record") Labels record, @Param("example") LabelsExample example);

    int updateByExampleWithBLOBs(@Param("record") Labels record, @Param("example") LabelsExample example);

    int updateByExample(@Param("record") Labels record, @Param("example") LabelsExample example);

    int updateByPrimaryKeySelective(Labels record);

    int updateByPrimaryKeyWithBLOBs(Labels record);

    int updateByPrimaryKey(Labels record);
}