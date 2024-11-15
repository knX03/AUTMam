package com.kn.musicmanagement.mapper;

import com.kn.musicmanagement.pojo.sysMess;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysMessMapper {
    int postMess(@Param("user_ID") String user_ID, @Param("text") String text);

    List<sysMess>  getMess(@Param("user_ID") String user_ID);
}
