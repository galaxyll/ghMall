package com.ghhh.ghmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ghhh.ghmall.bean.PmsBaseAttrInfo;
import com.ghhh.ghmall.service.AttrService;

import java.util.List;

/**
 * @author galaxy
 * @date 19-8-20 - 下午10:22
 */
public class AttrController {

    @Reference
    private AttrService attrService;

    public List<PmsBaseAttrInfo> getAttrInfo()
    {
        return null;
    }
}
