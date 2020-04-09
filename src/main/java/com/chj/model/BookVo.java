package com.chj.model;

import java.io.Serializable;

/**
 * @Description:
 * @Author: chj
 * @Date: 2020/3/24
 */
public class BookVo implements Serializable {
    private Integer id;
    /**
     * 书名
     * */
    private String bookName;
    /**
     * 书价格
     * */
    private Double bookPrice;
    /**
     * 书详情
     * */
    private String bookDetail;
    /**
     * 书类别名
     * */
    private String catName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "BookVo{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookDetail='" + bookDetail + '\'' +
                ", catName='" + catName + '\'' +
                '}';
    }
}
