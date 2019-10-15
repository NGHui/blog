package com.hui.blog.mapper;

import com.hui.blog.bean.Articles;
import com.hui.blog.bean.ArticlesExample;
import com.hui.blog.bean.ArticlesWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticlesMapper {
    int countByExample(ArticlesExample example);

    int deleteByExample(ArticlesExample example);

    int deleteByPrimaryKey(Long articleId);

    int insert(ArticlesWithBLOBs record);

    int insertSelective(ArticlesWithBLOBs record);

    List<ArticlesWithBLOBs> selectByExampleWithBLOBs(ArticlesExample example);

    List<Articles> selectByExample(ArticlesExample example);

    ArticlesWithBLOBs selectByPrimaryKey(Long articleId);

    int updateByExampleSelective(@Param("record") ArticlesWithBLOBs record, @Param("example") ArticlesExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticlesWithBLOBs record, @Param("example") ArticlesExample example);

    int updateByExample(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByPrimaryKeySelective(ArticlesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArticlesWithBLOBs record);

    int updateByPrimaryKey(Articles record);
}