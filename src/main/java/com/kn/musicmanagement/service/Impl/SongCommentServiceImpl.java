package com.kn.musicmanagement.service.Impl;


import com.kn.musicmanagement.mapper.SongCommentMapper;
import com.kn.musicmanagement.service.SongCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongCommentServiceImpl implements SongCommentService {

    @Autowired
    private SongCommentMapper songCommentMapper;

}
