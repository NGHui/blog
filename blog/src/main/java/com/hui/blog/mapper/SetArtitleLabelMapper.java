package com.hui.blog.mapper;

import com.hui.blog.bean.SetArtitleLabel;
import com.hui.blog.bean.SetArtitleLabelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SetArtitleLabelMapper {
    int countByExample(SetArtitleLabelExample example);

    int deleteByExample(SetArtitleLabelExample example);

    int deleteByPrimaryKey(Long articleId);

    int insert(SetArtitleLabel record);

    int insertSelective(SetArtitleLabel record);

    List<SetArtitleLabel> selectByExample(SetArtitleLabelExample example);

    SetArtitleLabel selectByPrimaryKey(Long articleId);

    int updateByExampleSelective(@Param("record") SetArtitleLabel record, @Param("example") SetArtitleLabelExample example);

    int updateByExample(@Param("record") SetArtitleLabel record, @Param("example") SetArtitleLabelExample example);

    int updateByPrimaryKeySelective(SetArtitleLabel record);

    int updateByPrimaryKey(SetArtitleLabel record);
}