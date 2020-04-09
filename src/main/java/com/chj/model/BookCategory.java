package com.chj.model;

import java.io.Serializable;
/**
 * @Description:
 * @Author: chj
 * @Date: 2020/3/24
 */
public class BookCategory implements Serializable {
    /**
     * 书id
     * */
    private Integer bookId;
    /**
     * 类别id
     * */
    private String categoryId;

    private static final long serialVersionUID = 1L;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }
}