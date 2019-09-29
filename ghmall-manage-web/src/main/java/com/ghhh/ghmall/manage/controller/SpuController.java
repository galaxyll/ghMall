package com.ghhh.ghmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ghhh.ghmall.bean.PmsProductInfo;
import com.ghhh.ghmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

    @ResponseBody
    @RequestMapping("/saveSpuInfo")
    public void saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo)
    {
        System.out.println(pmsProductInfo);
    }

    @RequestMapping("/fileUpload")
    @ResponseBody
    public String saveMedia(@RequestParam("file") MultipartFile multipartFile)
    {
        return "https://img30.360buyimg.com/sku/jfs/t27322/82/1288462069/147660/2d0ce757/5bc57779Na5ca3268.jpg";
    }

}
