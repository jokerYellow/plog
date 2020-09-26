package com.pipasese.blog.mapper;

import com.pipasese.blog.dao.BlogDao;
import com.pipasese.blog.model.Blog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class BlogMappertest {
    @Autowired
    private BlogDao blogDao;

    @Test
    public void testInsert() {
        blogDao.clear();
        int id1 = blogDao.insert(new Blog("一个短篇", "旋转，跳跃吧，她感到每条路都在头痛"));
        int id2 = blogDao.insert(new Blog("一个短篇1", "旋转，跳跃吧，她感到每条路都在头痛"));
        Assert.assertEquals(2, blogDao.allBlogs().size());
    }
}
