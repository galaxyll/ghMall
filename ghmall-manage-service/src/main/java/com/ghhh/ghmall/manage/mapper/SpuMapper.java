package com.ghhh.ghmall.manage.mapper;

import com.ghhh.ghmall.bean.PmsProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author galaxy
 * @date 19-9-28 - 下午12:17
 */
@Mapper
@Repository
public interface SpuMapper {

    @Select("select * from pms_product_info where catalog3_id=#{catalog3Id}")
    List<PmsProductInfo> selectSpuList(String catalog3Id);
}
