package com.ghhh.ghmall.bean;

import java.io.Serializable;

/**
 * @author galaxy
 * @date 19-8-19 - 下午9:51
 */
public class PmsBaseCatalog3 implements Serializable {

    private String id;
    private String name;

    public String getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(String catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

    private String catalog2Id;

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
