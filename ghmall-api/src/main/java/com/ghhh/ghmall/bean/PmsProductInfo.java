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
    private String spuName;
    private String description;
    private String catalog3Id;

    @TableField(exist = false)
    private List<PmsProductSaleAttr> spuSaleAttrList;
    @TableField(exist = false)
    private List<PmsProductImage> spuImageList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<PmsProductSaleAttr> getSpuSaleAttrList() {
        return spuSaleAttrList;
    }

    public void setSpuSaleAttrList(List<PmsProductSaleAttr> spuSaleAttrList) {
        this.spuSaleAttrList = spuSaleAttrList;
    }

    public List<PmsProductImage> getSpuImageList() {
        return spuImageList;
    }

    public void setSpuImageList(List<PmsProductImage> spuImageList) {
        this.spuImageList = spuImageList;
    }

    @Override
    public String toString() {
        return "PmsProductInfo{" +
                "id='" + id + '\'' +
                ", spuName='" + spuName + '\'' +
                ", description='" + description + '\'' +
                ", catalog3Id='" + catalog3Id + '\'' +
                ", spuSaleAttrList=" + spuSaleAttrList +
                ", spuImageList=" + spuImageList +
                '}';
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }
}
