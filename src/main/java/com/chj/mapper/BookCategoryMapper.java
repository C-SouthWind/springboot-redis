package com.chj.mapper;

import com.chj.model.BookCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
* @Description:
* @Author: chj
* @Date: 2020/3/24
*/
@Mapper
public interface BookCategoryMapper {
    /** 方法描述 
    * @Description: 根据实体新增
    * @Param: [record]
    * @return: int
    * @Author: chj
    * @Date: 2020/3/24
    */
    int insert(BookCategory record);
    /** 方法描述 
    * @Description: 查询所有
    * @Param: []
    * @return: java.util.List<com.chj.model.BookCategory>
    * @Author: chj
    * @Date: 2020/3/25
    */
    List<BookCategory> selectAll();
}