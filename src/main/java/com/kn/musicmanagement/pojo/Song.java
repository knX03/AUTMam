package com.kn.musicmanagement.pojo;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Song {
    private Integer id;
    private String song_ID;
    private String song_name;
    private String singer_name;
    private String singer_ID;
    private String album_name;
    private String album_ID;
    private String created_Time;
    private String song_Directory;
    private String song_Cover;
}
