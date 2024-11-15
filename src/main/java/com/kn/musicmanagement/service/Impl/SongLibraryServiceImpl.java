package com.kn.musicmanagement.service.Impl;

import com.kn.musicmanagement.mapper.SongLibraryMapper;
import com.kn.musicmanagement.service.SongLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongLibraryServiceImpl implements SongLibraryService {

    @Autowired
    private SongLibraryMapper songLibraryMapper;


}
