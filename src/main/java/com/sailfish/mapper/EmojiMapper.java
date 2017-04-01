package com.sailfish.mapper;

import com.sailfish.entity.Content;

import org.apache.ibatis.annotations.Param;

/**
 * @author sailfish
 * @create 2017-04-01-下午4:09
 */
public interface EmojiMapper {

    Integer insertContent(Content content);

    Content selectById(@Param("id") Integer id);
}
