package com.kn.musicmanagement.controller;


import com.kn.musicmanagement.pojo.Song;
import com.kn.musicmanagement.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/song")
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("/getAll")
    public Result getAll() {
        Result result = new Result();
        List<Song> songs = songService.getAll();
        result.setCode(200);
        result.setData(songs);
        return result;
    }

    @GetMapping("/getSongNum")
    public Result getSongNum() {
        Result result = new Result();
        List<Song> songs = songService.getAll();
        result.setCode(200);
        result.setData(songs.toArray().length);
        return result;
    }

    @GetMapping("/getUnapprovedSong")
    public Result getUnapprovedSong() {
        Result result = new Result();
        List<Song> songs = songService.getUnapprovedSong();
        result.setCode(200);
        result.setData(songs);
        return result;
    }

    @GetMapping("/getBanSong")
    public Result getBanSong() {
        Result result = new Result();
        List<Song> songs = songService.getBanSong();
        result.setCode(200);
        result.setData(songs);
        return result;
    }

    //审核歌曲
    @GetMapping("/ApprovedSong")
    public Result ApprovedSong(@RequestParam String song_ID, @RequestParam String song_Name) throws MessagingException {
        Result result = new Result();
        Boolean flag = songService.ApprovedSong(song_ID, song_Name);
        result.setCode(200);
        result.setData(flag);
        return result;
    }

    //重新上架歌曲
    @GetMapping("/arriveSong")
    public Result arriveSong(@RequestParam String song_ID, @RequestParam String song_Name) throws MessagingException {
        Result result = new Result();
        Boolean flag = songService.arriveSong(song_ID, song_Name);
        result.setCode(200);
        result.setData(flag);
        return result;
    }

    //下架歌曲
    @GetMapping("/banSong")
    public Result banSong(@RequestParam String song_ID) {
        Result result = new Result();
        Boolean flag = songService.banSong(song_ID);
        result.setCode(200);
        result.setData(flag);
        return result;
    }
}
