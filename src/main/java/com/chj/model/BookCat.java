package com.chj.model;

import java.io.Serializable;
/**
 * @Description:
 * @Author: chj
 * @Date: 2020/3/24
 */
public class BookCat implements Serializable {
    private Integer id;
    /**
    *  书种类名
    */
    private String catName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }
}