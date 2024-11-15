package com.kn.musicmanagement.service.Impl;


import com.kn.musicmanagement.mapper.AlbumMapper;
import com.kn.musicmanagement.pojo.Album;
import com.kn.musicmanagement.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public List<Album> getAllAlbum() {
        List<Album> albums = albumMapper.getAllAlbum();
        return albums;
    }
}
