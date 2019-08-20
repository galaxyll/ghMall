package com.ghhh.ghmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ghhh.ghmall.bean.PmsBaseCatalog1;
import com.ghhh.ghmall.bean.PmsBaseCatalog2;
import com.ghhh.ghmall.bean.PmsBaseCatalog3;
import com.ghhh.ghmall.manage.mapper.CatalogMapper;
import com.ghhh.ghmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author galaxy
 * @date 19-8-20 - 上午8:32
 */
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private CatalogMapper catalogMapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return catalogMapper.selectCatalog1();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        return catalogMapper.selectCatalog2(Integer.valueOf(catalog1Id));
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        return catalogMapper.selectCatalog3(Integer.valueOf(catalog2Id));
    }
}
