package com.ghhh.ghmall.user.mapper;

import com.ghhh.ghmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    @Select("select * from user")
    List<UmsMember> selectAllUser();
}
