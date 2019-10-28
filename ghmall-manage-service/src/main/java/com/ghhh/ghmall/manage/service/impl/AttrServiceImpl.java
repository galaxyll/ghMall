package com.ghhh.ghmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ghhh.ghmall.bean.PmsBaseAttrInfo;
import com.ghhh.ghmall.bean.PmsBaseAttrValue;
import com.ghhh.ghmall.bean.PmsBaseSaleAttr;
import com.ghhh.ghmall.manage.mapper.AttrMapper;
import com.ghhh.ghmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author galaxy
 * @date 19-8-21 - 下午12:01
 */
@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    private AttrMapper attrMapper;

    @Override
    public List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id) {

        List<PmsBaseAttrInfo> attrInfoList =  attrMapper.selectAttrInfo(catalog3Id);
        for (PmsBaseAttrInfo info:attrInfoList)
        {
            info.setAttrValueList(attrMapper.selectAttrValue(Integer.valueOf(info.getId())));
        }
        return attrInfoList;
    }

    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {

        attrMapper.insertAttrInfo(pmsBaseAttrInfo);

        for (PmsBaseAttrValue pmsBaseAttrValue:pmsBaseAttrInfo.getAttrValueList()){
            pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
            attrMapper.insertAttrValue(pmsBaseAttrValue);
        }

        return "success";
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValue(Integer attrId) {

       return attrMapper.selectAttrValue(attrId);
    }

    @Override
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        return attrMapper.selectBaseSaleAttrList();
    }
}
