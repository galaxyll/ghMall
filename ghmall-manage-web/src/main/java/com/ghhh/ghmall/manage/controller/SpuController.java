package com.ghhh.ghmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ghhh.ghmall.bean.PmsProductInfo;
import com.ghhh.ghmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author galaxy
 * @date 19-9-28 - 上午11:57
 */
@Controller
@CrossOrigin(allowCredentials = "true")
public class SpuController {

    @Reference
    private SpuService spuService;

    @ResponseBody
    @RequestMapping("/spuList")
    public List<PmsProductInfo> getSpuList(@RequestParam String catalog3Id)
    {
        return spuService.getSpuList(catalog3Id);
    }

}
