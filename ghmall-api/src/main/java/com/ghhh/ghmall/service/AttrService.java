package com.ghhh.ghmall.service;

import com.ghhh.ghmall.bean.PmsBaseAttrInfo;
import com.ghhh.ghmall.bean.PmsBaseAttrValue;

import java.util.List;

/**
 * @author galaxy
 * @date 19-8-20 - 下午10:24
 */
public interface AttrService {

    List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    /**
     *
     * @param attrId 属性id
     * @return 属性id对应的value的列表
     */
    List<PmsBaseAttrValue> getAttrValue(Integer attrId);

}
