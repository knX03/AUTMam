package com.kn.musicmanagement.mapper;

import com.kn.musicmanagement.pojo.Album;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AlbumMapper {

    /**
     * 查询所有专辑
     *
     * @return
     */
    List<Album> getAllAlbum();
}
