package com.kn.musicmanagement.mapper;

import com.kn.musicmanagement.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

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
     *
     * @return
     */
    LinkedHashMap<String,String> getUserChangeByMonth();


}
