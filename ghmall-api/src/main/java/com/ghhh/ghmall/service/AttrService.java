package com.ghhh.ghmall.service;

import com.ghhh.ghmall.bean.PmsBaseAttrInfo;

import java.util.List;

/**
 * @author galaxy
 * @date 19-8-20 - 下午10:24
 */
public interface AttrService {

    List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id);
}
