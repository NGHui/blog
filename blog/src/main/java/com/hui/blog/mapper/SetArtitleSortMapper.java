package com.hui.blog.mapper;

import com.hui.blog.bean.SetArtitleSortExample;
import com.hui.blog.bean.SetArtitleSortKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SetArtitleSortMapper {
    int countByExample(SetArtitleSortExample example);

    int deleteByExample(SetArtitleSortExample example);

    int deleteByPrimaryKey(SetArtitleSortKey key);

    int insert(SetArtitleSortKey record);

    int insertSelective(SetArtitleSortKey record);

    List<SetArtitleSortKey> selectByExample(SetArtitleSortExample example);

    int updateByExampleSelective(@Param("record") SetArtitleSortKey record, @Param("example") SetArtitleSortExample example);

    int updateByExample(@Param("record") SetArtitleSortKey record, @Param("example") SetArtitleSortExample example);
}