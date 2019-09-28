package com.ghhh.ghmall.bean;

import com.baomidou.mybatisplus.annotation.TableField;


import java.io.Serializable;
import java.util.List;

/**
 * @author galaxy
 * @date 19-9-28 - 上午11:36
 */
public class PmsProductInfo implements Serializable {
    private String id;
    private String productName;
    private String description;
    private String catalog3Id;

    @TableField(exist = false)
    private List<PmsProductSaleAttrInfo> pmsProductSaleAttrList;
    @TableField(exist = false)
    private List<PmsProductImage> pmsProductImageList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public List<PmsProductSaleAttrInfo> getPmsProductSaleAttrList() {
        return pmsProductSaleAttrList;
    }

    public void setPmsProductSaleAttrList(List<PmsProductSaleAttrInfo> pmsProductSaleAttrList) {
        this.pmsProductSaleAttrList = pmsProductSaleAttrList;
    }

    public List<PmsProductImage> getPmsProductImageList() {
        return pmsProductImageList;
    }

    public void setPmsProductImageList(List<PmsProductImage> pmsProductImageList) {
        this.pmsProductImageList = pmsProductImageList;
    }
}
