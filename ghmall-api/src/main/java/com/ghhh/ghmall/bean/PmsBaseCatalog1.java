package com.ghhh.ghmall.bean;


import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.List;

/**
 * @author galaxy
 * @date 19-8-19 - 下午9:41
 */

public class PmsBaseCatalog1 implements Serializable {


    private String id;
    private String name;

    @TableField(exist = false)
    private  List<PmsBaseCatalog2> catalog2s;

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
