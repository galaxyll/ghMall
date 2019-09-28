package com.ghhh.ghmall.service;

import com.ghhh.ghmall.bean.PmsProductInfo;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> getSpuList(String catalog3Id);
}
