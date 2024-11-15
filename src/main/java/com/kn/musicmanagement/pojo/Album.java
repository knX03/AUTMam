package com.kn.musicmanagement.pojo;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Album {
    private Integer id;
    private String album_ID;
    private String album_Name;
    private String singer_ID;
    private String singer_name;
    private String song_ID;
    private String create_Time;
    private String album_Introduction;
    private String album_Cover;

}
