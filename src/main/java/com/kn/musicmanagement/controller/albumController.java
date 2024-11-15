package com.kn.musicmanagement.controller;

import com.kn.musicmanagement.pojo.Album;
import com.kn.musicmanagement.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/album")
public class albumController {
    @Autowired
    private AlbumService albumService;

    @GetMapping("/getAll")
    public Result getAllAlbum() {
        Result result = new Result();
        List<Album> albums = albumService.getAllAlbum();
        result.setCode(200);
        result.setData(albums);
        return result;
    }

    @GetMapping("/getAlbumNum")
    public Result getAlbumNum() {
        Result result = new Result();
        List<Album> albums = albumService.getAllAlbum();
        result.setCode(200);
        result.setData(albums.toArray().length);
        return result;
    }
}
