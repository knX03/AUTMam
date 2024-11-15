package com.kn.musicmanagement.service.Impl;


import com.kn.musicmanagement.mapper.SingerMapper;
import com.kn.musicmanagement.pojo.Singer;
import com.kn.musicmanagement.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerMapper singerMapper;

    @Override
    public List<Singer> getAllSinger() {
        List<Singer> singers = singerMapper.getAllSinger();
        return singers;
    }
}
