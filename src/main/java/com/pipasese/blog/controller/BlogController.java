package com.pipasese.blog.controller;

import com.pipasese.blog.dao.BlogDao;
import com.pipasese.blog.model.Blog;
import com.pipasese.blog.util.Response;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    @Resource
    BlogDao blogDao;

    @GetMapping
    public Response<Object> allBlogs() {
        return Response.success(blogDao.allBlogs());
    }

    @PutMapping
    public Response<Object> insertBlog(Blog blog) {
        blogDao.insert(blog);
        return Response.success(blog);
    }

    @PostMapping
    public Response<Object> update(Blog blog) {
        blogDao.updateByPrimaryKeySelective(blog);
        return Response.success(blog);
    }

}
