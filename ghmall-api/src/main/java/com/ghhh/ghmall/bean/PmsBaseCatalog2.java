package com.ghhh.ghmall.bean;


import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.List;

/**
 * @author galaxy
 * @date 19-8-19 - 下午9:51
 */
public class PmsBaseCatalog2 implements Serializable {

    private String id;
    private String name;
    private String catalog1Id;
    @TableField(exist = false)
    private List<PmsBaseCatalog3> catalog3List;

    public List<PmsBaseCatalog3> getCatalog3List() {
        return catalog3List;
    }

    public void setCatalog3List(List<PmsBaseCatalog3> catalog3List) {
        this.catalog3List = catalog3List;
    }

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

    public String getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(String catalog1Id) {
        this.catalog1Id = catalog1Id;
    }
}
