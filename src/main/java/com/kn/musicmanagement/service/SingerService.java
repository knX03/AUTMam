package com.kn.musicmanagement.service;

import com.kn.musicmanagement.pojo.Singer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface SingerService {

    /**
     * 查询所有歌手
     *
     * @return
     */
    List<Singer> getAllSinger();
}
