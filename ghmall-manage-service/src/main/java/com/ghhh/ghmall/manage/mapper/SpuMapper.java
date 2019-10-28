package com.ghhh.ghmall.manage.mapper;

import com.ghhh.ghmall.bean.PmsProductImage;
import com.ghhh.ghmall.bean.PmsProductInfo;
import com.ghhh.ghmall.bean.PmsProductSaleAttr;
import com.ghhh.ghmall.bean.PmsProductSaleAttrValue;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
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

    /**
     * 功能见接口
     * @param catalog3Id 商品三级分类id
     * @return 该分类下所有商品的spu
     */
    @Select("select id,product_name as spu_name,description,catalog3_id from pms_product_info where " +
            "catalog3_id=#{catalog3Id}")
    List<PmsProductInfo> selectSpuList(String catalog3Id);

    /**
     * 功能见接口
     * @param image 商品图像对象
     */
    @Insert("insert into pms_product_image(product_id,img_name,img_url) values(#{productId},#{imgName},#{imgUrl})")
    void insertProductImage(PmsProductImage image);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into pms_product_info(product_name,description,catalog3_id) values(#{spuName},#{description}," +
            "#{catalog3Id})")
    int insertProductInfo(PmsProductInfo pmsProductInfo);

    @Insert("insert into pms_product_sale_attr_value(product_id,sale_attr_id,sale_attr_value_name) values" +
            "(#{productId},#{saleAttrId},#{saleAttrValueName})")
    void insertProductSaleAttrValue(PmsProductSaleAttrValue saleAttrValue);
}
