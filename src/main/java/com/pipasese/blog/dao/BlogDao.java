package com.pipasese.blog.dao;

import com.pipasese.blog.model.Blog;

import java.util.List;

public interface BlogDao {

    List<Blog> allBlogs();

    void clear();

    int deleteByPrimaryKey(Integer id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);
}