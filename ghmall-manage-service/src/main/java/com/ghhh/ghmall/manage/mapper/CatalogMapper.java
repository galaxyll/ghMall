package com.ghhh.ghmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ghhh.ghmall.bean.PmsBaseCatalog1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author galaxy
 */

@Mapper
@Repository
public interface CatalogMapper extends BaseMapper<PmsBaseCatalog1>{

    @Select("select * from pms_base_catalog1")
    List<PmsBaseCatalog1> selectCatalog1();
}
