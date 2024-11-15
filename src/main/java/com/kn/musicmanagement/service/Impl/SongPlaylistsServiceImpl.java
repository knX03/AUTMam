package com.kn.musicmanagement.service.Impl;


import com.kn.musicmanagement.mapper.SongPlaylistsMapper;
import com.kn.musicmanagement.service.SongPlaylistsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongPlaylistsServiceImpl implements SongPlaylistsService {

    @Autowired
    private SongPlaylistsMapper songPlaylistsMapper;


}
