package com.ghhh.ghmall.manage.mapper;

import com.ghhh.ghmall.bean.PmsBaseAttrInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author galaxy
 * @date 19-8-21 - 下午12:06
 */

@Mapper
public interface AttrMapper {

    @Select("select * from pms_base_attr_info where catalog3_id=#{catalog3Id}")
    List<PmsBaseAttrInfo> selectAttrInfo(String catalog3Id);
}
