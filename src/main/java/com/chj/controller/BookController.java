package com.chj.controller;

import com.chj.model.BookVo;
import com.chj.service.BookService;
import com.chj.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: chj
 * @Date: 2020/3/24
 */
@RequestMapping("/book")
@RestController
public class BookController {
    @Autowired
    private RedisService redisService;

    @Autowired
    private BookService bookService;

    /** 方法描述
     * @Description: 查询图书信息和图书类别
     * @Param: [redisService]
     * @return: java.util.List<com.chj.model.BookVo>
     * @Author: chj
     * @Date: 2020/3/25
     */
    @GetMapping("/selectBookCatOrBook")
    public List<BookVo> selectBookCatOrBook(){
        return bookService.selectBookCatOrBook(redisService);
    }
    /** 方法描述
    * @Description: 测试存进去没有
    * @Param: []
    * @return: java.lang.String
    * @Author: chj
    * @Date: 2020/3/25
    */
    @GetMapping("/testGetKey")
    public String testGetKey(){
        return  bookService.testGetKey(redisService);
    }


}
