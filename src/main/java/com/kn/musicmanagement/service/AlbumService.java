package com.kn.musicmanagement.service;

import com.kn.musicmanagement.pojo.Album;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AlbumService {


    /**
     * 查询所有专辑
     *
     * @return
     */
    List<Album> getAllAlbum();
}
