package com.kn.musicmanagement.mapper;


import com.kn.musicmanagement.pojo.Song;
import com.kn.musicmanagement.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SongMapper {

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
     * 查询下架的歌曲
     *
     * @return
     */
    List<Song> getBanSong();

    /**
     * 通过审核
     *
     * @return
     */
    int ApprovedSong(String song_ID);

    /**
     * 上架歌曲
     *
     * @return
     */
    int arriveSong(String song_ID);

    /**
     * 下架歌曲
     *
     * @return
     */
    int banSong(String song_ID);

    /**
     * 根据songID查找用户邮箱
     * @param songID
     * @return
     */
    User getEmailByUserID(@Param("songID") String songID);

}
