package com.ghhh.ghmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ghhh.ghmall.bean.UmsMember;
import com.ghhh.ghmall.user.mapper.UserMapper;
import com.ghhh.ghmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author galaxy
 * @date 19-8-13 - 下午2:28
 */
@Component
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }
}
