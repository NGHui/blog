package com.hui.blog.mapper;

import com.hui.blog.bean.Sorts;
import com.hui.blog.bean.SortsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SortsMapper {
    int countByExample(SortsExample example);

    int deleteByExample(SortsExample example);

    int deleteByPrimaryKey(Long sortId);

    int insert(Sorts record);

    int insertSelective(Sorts record);

    List<Sorts> selectByExampleWithBLOBs(SortsExample example);

    List<Sorts> selectByExample(SortsExample example);

    Sorts selectByPrimaryKey(Long sortId);

    int updateByExampleSelective(@Param("record") Sorts record, @Param("example") SortsExample example);

    int updateByExampleWithBLOBs(@Param("record") Sorts record, @Param("example") SortsExample example);

    int updateByExample(@Param("record") Sorts record, @Param("example") SortsExample example);

    int updateByPrimaryKeySelective(Sorts record);

    int updateByPrimaryKeyWithBLOBs(Sorts record);

    int updateByPrimaryKey(Sorts record);
}