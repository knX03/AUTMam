package com.kn.musicmanagement.controller;

import com.kn.musicmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class userController {
    @Autowired
    private UserService userService;

    @GetMapping("/selectUserNum")
    public Result selectUserNum() {
        Result result = new Result();
        Map<String, Integer> ageMap = new LinkedHashMap<>();
        ageMap.put("youth", 0);
        ageMap.put("middle", 0);
        ageMap.put("old", 0);
        List<String> ages = userService.getAge();
        ageMap.put("total", (ages.toArray().length));
        for (String age : ages) {
            int a = Integer.parseInt(age);
            if (a < 30) {
                ageMap.put("youth", ageMap.get("youth") + 1);
            } else if (a > 30 && a < 60) {
                ageMap.put("middle", ageMap.get("middle") + 1);
            } else if (a > 60 && a < 100) {
                ageMap.put("old", ageMap.get("old") + 1);
            }
        }
        result.setCode(200);
        result.setData(ageMap);
        return result;
    }

    @GetMapping("/userNumChange")
    public Result userNumChange() {
        Result result = new Result();
        LinkedHashMap<String, String> userChangeByMonth = userService.getUserChangeByMonth();
        result.setCode(200);
        result.setData(userChangeByMonth.values());
        return result;
    }
}
