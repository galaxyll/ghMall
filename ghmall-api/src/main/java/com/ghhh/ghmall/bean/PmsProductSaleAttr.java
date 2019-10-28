package com.ghhh.ghmall.bean;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.List;

/**
 * @author galaxy
 * @date 19-9-28 - 上午11:45
 */
public class PmsProductSaleAttr implements Serializable {
    private String id;
    private String productId;
    private String saleAttrId;
    private String saleAttrName;

    @TableField(exist = false)
    private List<PmsProductSaleAttrValue> spuSaleAttrValueList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "PmsProductSaleAttr{" +
                "id='" + id + '\'' +
                ", productId='" + productId + '\'' +
                ", saleAttrId='" + saleAttrId + '\'' +
                ", saleAttrName='" + saleAttrName + '\'' +
                ", spuSaleAttrValueList=" + spuSaleAttrValueList +
                '}';
    }

    public String getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(String saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    public List<PmsProductSaleAttrValue> getSpuSaleAttrValueList() {
        return spuSaleAttrValueList;
    }

    public void setSpuSaleAttrValueList(List<PmsProductSaleAttrValue> spuSaleAttrValueList) {
        this.spuSaleAttrValueList = spuSaleAttrValueList;
    }

}
