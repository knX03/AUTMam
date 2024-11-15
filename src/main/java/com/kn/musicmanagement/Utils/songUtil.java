package com.kn.musicmanagement.Utils;

import com.kn.musicmanagement.pojo.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.kn.musicmanagement.Utils.messConstants.TITLE_APPROVED_MESS;

public class songUtil {

    public static void formatSDirectory(List<Song> songs) {
        for (Song song : songs) {
            String newSong_Directory = "http://localhost:5173/" + song.getSong_Directory();
            song.setSong_Directory(newSong_Directory);
        }
    }

    public static List<String> searchValue(List<String> searchList, String searchValue) {
        List<String> resList = new ArrayList<>();
        String pattern = "^" + searchValue;
        Pattern p = Pattern.compile(pattern);
        Matcher m = null;
        for (String s : searchList) {
            m = p.matcher(s);
            if (m.find()) {
                resList.add(s);
            }
        }
        return resList;
    }

    public static String createApprovedSongMess(String user_Name, String song_Name) {
        String mess = TITLE_APPROVED_MESS +
                "\n" + user_Name +
                "，您发布的歌曲：" + song_Name + "，通过了审核。";
        return mess;
    }

    public static String createArriveSongMess(String user_Name, String song_Name) {
        String mess = TITLE_APPROVED_MESS +
                "\n" + user_Name +
                "，您的歌曲：" + song_Name + "，已重新发布。";
        return mess;
    }
}
