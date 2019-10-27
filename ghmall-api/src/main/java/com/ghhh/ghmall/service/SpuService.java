package com.ghhh.ghmall.service;

import com.ghhh.ghmall.bean.PmsProductImage;
import com.ghhh.ghmall.bean.PmsProductInfo;
import com.ghhh.ghmall.bean.PmsProductSaleAttr;

import java.util.List;

public interface SpuService {
    /**
     * 获得该分类下的所有商品
     * @param catalog3Id 商品三级分类id
     * @return 商品列表
     */
    List<PmsProductInfo> getSpuList(String catalog3Id);

    /**
     * 添加从前端接收到的商品图片列表信息并调用dao层存储
     * @param image　商品图片对象
     */
    void addProductImage(PmsProductImage image);

    int addProductInfo(PmsProductInfo pmsProductInfo);

    void addProductSaleAttr(PmsProductSaleAttr saleAttr);
}
