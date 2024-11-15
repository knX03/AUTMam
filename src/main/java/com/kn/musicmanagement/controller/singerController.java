package com.kn.musicmanagement.controller;

import com.kn.musicmanagement.pojo.Singer;
import com.kn.musicmanagement.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/singer")
public class singerController {
    @Autowired
    private SingerService singerService;


    @GetMapping("/getAllSinger")
    public Result getAllSinger() {
        Result result = new Result();
        List<Singer> singers = singerService.getAllSinger();
        result.setCode(200);
        result.setData(singers);
        return result;
    }

    @GetMapping("/getSingerNum")
    public Result getSingerNum() {
        Result result = new Result();
        List<Singer> singers = singerService.getAllSinger();
        result.setCode(200);
        result.setData(singers.toArray().length);
        return result;
    }
}
