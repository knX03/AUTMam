package com.kn.musicmanagement.pojo;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SongComment {
    private Integer id;
    private String song_ID;
    private String comment;
    private String creator;
    private String postingTime;

}
