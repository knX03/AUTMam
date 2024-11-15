package com.kn.musicmanagement.service.Impl;

import com.kn.musicmanagement.mapper.UserMapper;
import com.kn.musicmanagement.pojo.User;
import com.kn.musicmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAll() {
        List<User> users = userMapper.getAll();
        return users;
    }

    @Override
    public List<String> getAge() {
        List<String> ages = userMapper.getAge();
        return ages;
    }

    @Override
    public  LinkedHashMap<String,String> getUserChangeByMonth() {
        LinkedHashMap<String,String> userChangeByMonth = userMapper.getUserChangeByMonth();
        return userChangeByMonth;
    }

}
