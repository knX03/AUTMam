package com.kn.musicmanagement.pojo;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Singer {
    private Integer id;
    private String singer_ID;
    private String user_ID;
    private String singer_Name;
    private Integer singer_Age;
    private String singer_Sex;
    private String singer_Introduction;
    private String singer_Avatar;
    private String singer_Lang;
    private String singer_Type;
}
