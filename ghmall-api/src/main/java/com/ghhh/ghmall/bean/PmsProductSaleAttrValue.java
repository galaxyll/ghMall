package com.ghhh.ghmall.bean;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

/**
 * @author galaxy
 * @date 19-9-28 - 上午11:52
 */
public class PmsProductSaleAttrValue implements Serializable {

    private String id;
    private String productId;
    private String saleAttrId;
    private String saleAttrValueName;

    @TableField(exist = false)
    private String isChecked;

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

    public String getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(String saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }

    @Override
    public String toString() {
        return "PmsProductSaleAttrValue{" +
                "id='" + id + '\'' +
                ", productId='" + productId + '\'' +
                ", saleAttrId='" + saleAttrId + '\'' +
                ", saleAttrValueName='" + saleAttrValueName + '\'' +
                ", isChecked='" + isChecked + '\'' +
                '}';
    }
}
