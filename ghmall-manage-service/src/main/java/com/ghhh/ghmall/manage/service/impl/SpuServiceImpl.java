package com.ghhh.ghmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ghhh.ghmall.bean.PmsProductInfo;
import com.ghhh.ghmall.manage.mapper.SpuMapper;
import com.ghhh.ghmall.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author galaxy
 * @date 19-9-28 - 下午12:15
 */
@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    private SpuMapper spuMapper;

    @Override
    public List<PmsProductInfo> getSpuList(String catalog3Id) {
        return spuMapper.selectSpuList(catalog3Id);
    }
}
