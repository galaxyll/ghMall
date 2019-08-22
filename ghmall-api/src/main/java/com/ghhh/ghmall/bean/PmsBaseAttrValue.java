package com.ghhh.ghmall.bean;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;


/**
 * @author galaxy
 * @date 19-8-20 - 下午10:18
 */
public class PmsBaseAttrValue implements Serializable {

    private String id;
    private String valueName;
    private String attrId;
    private String isEnabled;

    @TableField(exist = false)
    private String urlParam;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getUrlParam() {
        return urlParam;
    }

    public void setUrlParam(String urlParam) {
        this.urlParam = urlParam;
    }
}
