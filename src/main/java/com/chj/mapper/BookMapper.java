package com.chj.mapper;

import com.chj.model.Book;
import com.chj.model.BookVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * @Description:
 * @Author: chj
 * @Date: 2020/3/24
 */
@Mapper
public interface BookMapper {

    /** 方法描述
    * @Description: 根据id删除
    * @Param: [id]
    * @return: int
    * @Author: chj
    * @Date: 2020/3/25
    */
    int deleteByPrimaryKey(Integer id);

    /** 方法描述
    * @Description: 根据实体修改
    * @Param: [record]
    * @return: int
    * @Author: chj
    * @Date: 2020/3/25
    */
    int insert(Book record);

    /** 方法描述
    * @Description: 跟俊id查询
    * @Param: [id]
    * @return: com.chj.model.Book
    * @Author: chj
    * @Date: 2020/3/25
    */
    Book selectByPrimaryKey(Integer id);
    /** 方法描述
    * @Description: 查询所有
    * @Param: []
    * @return: java.util.List<com.chj.model.Book>
    * @Author: chj
    * @Date: 2020/3/25
    */
    List<Book> selectAll();

    /** 方法描述
    * @Description: 根据实体修改
    * @Param: [record]
    * @return: int
    * @Author: chj
    * @Date: 2020/3/25
    */
    int updateByPrimaryKey(Book record);


    /** 方法描述
    * @Description: 查询图书信息和图书类别
    * @Param: []
    * @return: java.util.List<com.chj.model.BookVo>
    * @Author: chj
    * @Date: 2020/3/25
    */
    List<BookVo> selectBookCatOrBook();
}