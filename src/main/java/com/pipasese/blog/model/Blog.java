package com.pipasese.blog.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * blogs
 *
 * @author
 */
@Data
public class Blog implements Serializable {
    private Integer id;

    private String title;

    private String content;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Blog(String title, String content) {
        this.title = title;
        this.content = content;
    }
}