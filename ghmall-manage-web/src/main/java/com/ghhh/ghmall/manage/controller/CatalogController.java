package com.ghhh.ghmall.manage.controller;

import com.ghhh.ghmall.bean.PmsBaseCatalog1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author galaxy
 * @date 19-8-19 - 下午9:35
 */
public class CatalogController {

    @RequestMapping("/getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1()
    {

    }
}
