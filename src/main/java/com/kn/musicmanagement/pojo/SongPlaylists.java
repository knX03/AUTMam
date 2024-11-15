package com.kn.musicmanagement.pojo;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SongPlaylists {
    private Integer id;
    private String playlist_ID;
    private String playlist_Name;
    private String song_ID;
    private String create_By;
    private String create_Time;
    private String playlist_Introduction;

}
