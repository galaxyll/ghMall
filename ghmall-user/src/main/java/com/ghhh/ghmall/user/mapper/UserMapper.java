package com.ghhh.ghmall.user.mapper;

import com.ghhh.ghmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author galaxy
 */
@Mapper
@Repository
public interface UserMapper{

    /**
     * 读取数据库中普通用户数据装配成对象放置列表中返回
     * @return umsMember list
     */
    @Select("select * from ums_member")
    List<UmsMember> selectAllUser();
}
