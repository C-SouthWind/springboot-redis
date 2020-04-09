package com.chj.mapper;

import com.chj.model.BookCat;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * @Description:
 * @Author: chj
 * @Date: 2020/3/24
 */
@Mapper
public interface BookCatMapper {
    /** 方法描述 
    * @Description: 根据id删除
    * @Param: [id]
    * @return: int
    * @Author: chj
    * @Date: 2020/3/25
    */
    int deleteByPrimaryKey(Integer id);
    /** 方法描述 
    * @Description: 根据实体新增
    * @Param: [record]
    * @return: int
    * @Author: chj
    * @Date: 2020/3/25
    */
    int insert(BookCat record);
    /** 方法描述
    * @Description:
    * @Param: [id]
    * @return: com.chj.model.BookCat
    * @Author: chj
    * @Date: 2020/3/25
    */
    BookCat selectByPrimaryKey(Integer id);
    /** 方法描述 
    * @Description: 查询所有
    * @Param: []
    * @return: java.util.List<com.chj.model.BookCat>
    * @Author: chj
    * @Date: 2020/3/25
    */
    List<BookCat> selectAll();
    /** 方法描述 
    * @Description: 根据实体修改
    * @Param: [record]
    * @return: int
    * @Author: chj
    * @Date: 2020/3/25
    */
    int updateByPrimaryKey(BookCat record);
}