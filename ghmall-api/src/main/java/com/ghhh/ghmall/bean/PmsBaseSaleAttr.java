package com.ghhh.ghmall.bean;

import java.io.Serializable;

/**
 * @author galaxy
 * @date 19-9-28 - 下午10:13
 */
public class PmsBaseSaleAttr implements Serializable {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
