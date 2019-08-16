package com.ghhh.ghmall.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ghhh.ghmall.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author galaxy
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<UmsMember> {

    /**
     * 继承了mybatis plus的通用mapper接口
     * 读取数据库中普通用户数据装配成对象放置列表中返回
     * @return UmsMember list
     */
    @Select("select * from ums_member")
    List<UmsMember> selectAllUser();
}
