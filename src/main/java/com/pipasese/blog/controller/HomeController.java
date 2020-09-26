package com.pipasese.blog.controller;

import com.pipasese.blog.config.Configuration;
import com.pipasese.blog.dao.BlogDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class HomeController {

    @Resource
    BlogDao blogDao;

    @Resource
    Configuration configuration;

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("title",configuration.getBlogTitle());
        model.addAttribute("blogs", blogDao.allBlogs());
        return "index";
    }

    @GetMapping("/index/blog")
    public Object blog(int id, Model model) {
        model.addAttribute("blog", blogDao.selectByPrimaryKey(id));
        return "blog";
    }
}
