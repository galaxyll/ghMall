package com.ghhh.ghmall.bean;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.List;

/**
 * @author galaxy
 * @date 19-9-28 - 上午11:45
 */
public class PmsProductSaleAttrInfo implements Serializable {
    private String id;
    private String productId;
    private String saleAttrInfoId;
    private String saleAttrInfoName;

    @TableField(exist = false)
    private List<PmsProductSaleAttrValue> pmsProductSaleAttrValueList;

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

    public String getSaleAttrInfoId() {
        return saleAttrInfoId;
    }

    public void setSaleAttrInfoId(String saleAttrInfoId) {
        this.saleAttrInfoId = saleAttrInfoId;
    }


    public List<PmsProductSaleAttrValue> getPmsProductSaleAttrValueList() {
        return pmsProductSaleAttrValueList;
    }

    public void setPmsProductSaleAttrValueList(List<PmsProductSaleAttrValue> pmsProductSaleAttrValueList) {
        this.pmsProductSaleAttrValueList = pmsProductSaleAttrValueList;
    }

    public String getSaleAttrInfoName() {
        return saleAttrInfoName;
    }

    public void setSaleAttrInfoName(String saleAttrInfoName) {
        this.saleAttrInfoName = saleAttrInfoName;
    }
}
