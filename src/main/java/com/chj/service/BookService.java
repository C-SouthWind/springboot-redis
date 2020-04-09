package com.chj.service;

import com.chj.mapper.BookMapper;
import com.chj.model.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.exceptions.JedisNoReachableClusterNodeException;


import java.util.List;

/**
 * @Description:
 * @Author: chj
 * @Date: 2020/3/24
 */
@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    /** 方法描述 
    * @Description: 查询图书信息和图书类别
    * @Param: [redisService]
    * @return: java.util.List<com.chj.model.BookVo>
    * @Author: chj
    * @Date: 2020/3/25
    */
    public List<BookVo> selectBookCatOrBook(RedisService redisService){
        List<BookVo> books = null;
            //查询书籍信息
            books = bookMapper.selectBookCatOrBook();
            if (redisOperate(books,redisService)){
                System.out.println("-------------redis连接成功");
            }else{
                return books;
            }
        return books;
    }
    /** 方法描述 
    * @Description: Redis操作以及报错解决
    * @Param: [books, redisService]
    * @return: boolean
    * @Author: chj
    * @Date: 2020/3/25
    */
    public boolean redisOperate (List<BookVo> books,RedisService redisService){
        //非空判断
        if (null!=books && books.size()>0) {
            try {
                //存redis
                redisService.set("book", books.toString());
                redisService.expire("book",50000);
            }catch(JedisNoReachableClusterNodeException e){
                System.out.println("-------------redis集群连接失败");
                return false;
            }
        }
        return true;
    }









    /** 方法描述 
    * @Description: 测试是否存入
    * @Param: [redisService]
    * @return: java.lang.String
    * @Author: chj
    * @Date: 2020/3/25
    */
    public String testGetKey(RedisService redisService){
        return redisService.get("book");
    }




}
