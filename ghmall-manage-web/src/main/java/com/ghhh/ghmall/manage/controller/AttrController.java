package com.ghhh.ghmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ghhh.ghmall.bean.PmsBaseAttrInfo;
import com.ghhh.ghmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author galaxy
 * @date 19-8-20 - 下午10:22
 */
@Controller
@CrossOrigin(allowCredentials = "true")
public class AttrController {

    @Reference
    private AttrService attrService;

    @GetMapping("/attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id)
    {
        return attrService.getAttrInfo(catalog3Id);
    }

    @RequestMapping("/saveAttrInfo")
    @ResponseBody
    public void addAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo)
    {
        String status = attrService.saveAttrInfo(pmsBaseAttrInfo);
    }

    @RequestMapping("/getAttrValueList")
    @ResponseBody
    public List<String> getAttrValueList(@RequestParam(name = "attrId") Integer attrId)
    {
        return attrService.getAttrValue(attrId);
    }
}
