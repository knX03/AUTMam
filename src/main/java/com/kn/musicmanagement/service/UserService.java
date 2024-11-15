package com.kn.musicmanagement.service;

import com.kn.musicmanagement.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Transactional
public interface UserService {

    /**
     * 查询全部用户
     *
     * @return
     */
    List<User> getAll();

    /**
     * 查询用户年龄
     *
     * @return
     */
    List<String> getAge();

    /**
     * 查询每个月份的用户
     * @return
     */
    LinkedHashMap<String,String> getUserChangeByMonth();

}
