package com.kn.musicmanagement.service;


import com.kn.musicmanagement.pojo.Song;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.MessagingException;
import java.util.List;

@Transactional
public interface SongService {


    /**
     * 查找所有歌曲
     *
     * @return
     */
    List<Song> getAll();

    /**
     * 查询待审核的歌曲
     *
     * @return
     */
    List<Song> getUnapprovedSong();

    /**
     * 通过审核
     *
     * @return
     */
    Boolean ApprovedSong(String song_ID, String song_Name) throws MessagingException;


    /**
     * 上架歌曲
     *
     * @return
     */
    Boolean arriveSong(String song_ID, String song_Name) throws MessagingException;

    /**
     * 下架歌曲
     *
     * @return
     */
    Boolean banSong(String song_ID);


    /**
     * 查询下架的歌曲
     *
     * @return
     */
    List<Song> getBanSong();
}
