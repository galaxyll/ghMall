package com.ghhh.ghmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ghhh.ghmall.bean.PmsBaseCatalog1;
import com.ghhh.ghmall.bean.PmsBaseCatalog2;
import com.ghhh.ghmall.bean.PmsBaseCatalog3;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author galaxy
 */

@Mapper
@Repository
public interface CatalogMapper extends BaseMapper{

    @Select("select * from pms_base_catalog1")
    List<PmsBaseCatalog1> selectCatalog1();

    @Select("select * from pms_base_catalog2 where catalog1_id=#{catalog1Id}")
    List<PmsBaseCatalog2> selectCatalog2(Integer catalog1Id);

    @Select("select * from pms_base_catalog3 where catalog2_id=#{catalog2Id}")
    List<PmsBaseCatalog3> selectCatalog3(Integer catalog2Id);
}
