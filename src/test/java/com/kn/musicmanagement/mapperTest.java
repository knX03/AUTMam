package com.kn.musicmanagement;

import com.kn.musicmanagement.mapper.SysMessMapper;
import com.kn.musicmanagement.pojo.sysMess;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static com.kn.musicmanagement.Utils.songUtil.createApprovedSongMess;

@SpringBootTest
public class mapperTest {
    @Autowired
    private SysMessMapper sysMessMapper;

    @Test
    void test1() {
        String mess = createApprovedSongMess("张三", "借口");
        System.out.println(mess);
        String[] strings = mess.split("\n");
        System.out.println(Arrays.toString(strings));
//        int flag = sysMessMapper.postMess("111", mess);
//        List<sysMess> mess1 = sysMessMapper.getMess("111");
//        for (sysMess sysMess : mess1) {
//            System.out.println(sysMess.getMess_text() + sysMess.getMess_time());
//        }
    }
}
