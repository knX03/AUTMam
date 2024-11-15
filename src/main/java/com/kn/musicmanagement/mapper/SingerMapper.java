package com.kn.musicmanagement.mapper;

import com.kn.musicmanagement.pojo.Singer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SingerMapper {

    /**
     * 查询所有歌手
     *
     * @return
     */
    List<Singer> getAllSinger();
}
