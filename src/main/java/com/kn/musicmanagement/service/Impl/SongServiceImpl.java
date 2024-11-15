package com.kn.musicmanagement.service.Impl;


import com.kn.musicmanagement.Utils.songUtil;
import com.kn.musicmanagement.mapper.SongMapper;
import com.kn.musicmanagement.mapper.SysMessMapper;
import com.kn.musicmanagement.pojo.Song;
import com.kn.musicmanagement.pojo.User;
import com.kn.musicmanagement.service.EmailSendService;
import com.kn.musicmanagement.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.MessagingException;
import java.util.List;

import static com.kn.musicmanagement.Utils.songUtil.createApprovedSongMess;
import static com.kn.musicmanagement.Utils.songUtil.createArriveSongMess;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongMapper songMapper;

    @Autowired
    private SysMessMapper sysMessMapper;

    @Autowired
    private EmailSendService emailSendService;

    @Override
    public List<Song> getAll() {
        List<Song> songs = songMapper.getAll();
        return songs;
    }

    @Override
    public List<Song> getUnapprovedSong() {
        List<Song> songs = songMapper.getUnapprovedSong();
        songUtil.formatSDirectory(songs);
        return songs;
    }

    @Transactional
    @Override
    public Boolean ApprovedSong(String song_ID, String song_Name) throws MessagingException {
        int flag = songMapper.ApprovedSong(song_ID);
        //发送邮箱通知
        User user = songMapper.getEmailByUserID(song_ID);
        String mess = createApprovedSongMess(user.getUser_Name(), song_Name);
        sysMessMapper.postMess(user.getUser_ID(), mess);
        emailSendService.sendApprovedSong(user, song_Name);
        return flag > 0;
    }

    @Override
    @Transactional
    public Boolean arriveSong(String song_ID, String song_Name) throws MessagingException {
        int flag = songMapper.arriveSong(song_ID);
        User user = songMapper.getEmailByUserID(song_ID);
        String arriveSongMess = createArriveSongMess(user.getUser_Name(), song_Name);
        sysMessMapper.postMess(user.getUser_ID(), arriveSongMess);
        emailSendService.sendArriveSongMess(user, song_Name);
        return flag > 0;
    }

    @Override
    public Boolean banSong(String song_ID) {
        int flag = songMapper.banSong(song_ID);
        return flag > 0;
    }

    @Override
    public List<Song> getBanSong() {
        List<Song> songs = songMapper.getBanSong();
        songUtil.formatSDirectory(songs);
        return songs;
    }

}
