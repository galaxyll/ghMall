package com.ghhh.ghmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ghhh.ghmall.bean.PmsBaseAttrInfo;
import com.ghhh.ghmall.bean.PmsBaseAttrValue;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author galaxy
 * @date 19-8-21 - 下午12:06
 */

@Mapper
public interface AttrMapper extends BaseMapper<PmsBaseAttrInfo> {

    @Select("select * from pms_base_attr_info where catalog3_id=#{catalog3Id}")
    List<PmsBaseAttrInfo> selectAttrInfo(String catalog3Id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into pms_base_attr_info(attr_name,catalog3_id) values(#{attrName}," +
            "#{catalog3Id})")
    int insertAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    @Insert("insert into pms_base_attr_value(value_name,attr_id) values(#{valueName},#{attrId})")
    void insertAttrValue(PmsBaseAttrValue pmsBaseAttrValue);

}
