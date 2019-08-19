package com.ghhh.ghmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ghhh.ghmall.bean.UmsMember;
import com.ghhh.ghmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author galaxy
 * @date 19-8-13 - 下午2:28
 */
@Controller
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index()
    {
        return "hello user";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser()
    {
        return userService.getAllUser();
    }
}
