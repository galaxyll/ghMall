package com.ghhh.ghmall.user.service.impl;

import com.ghhh.ghmall.user.bean.UmsMember;
import com.ghhh.ghmall.user.mapper.UserMapper;
import com.ghhh.ghmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author galaxy
 * @date 19-8-13 - 下午2:28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }
}
