package com.hui.blog.mapper;

import com.hui.blog.bean.UserFriends;
import com.hui.blog.bean.UserFriendsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserFriendsMapper {
    int countByExample(UserFriendsExample example);

    int deleteByExample(UserFriendsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserFriends record);

    int insertSelective(UserFriends record);

    List<UserFriends> selectByExample(UserFriendsExample example);

    UserFriends selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserFriends record, @Param("example") UserFriendsExample example);

    int updateByExample(@Param("record") UserFriends record, @Param("example") UserFriendsExample example);

    int updateByPrimaryKeySelective(UserFriends record);

    int updateByPrimaryKey(UserFriends record);
}