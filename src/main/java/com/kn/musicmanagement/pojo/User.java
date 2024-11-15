package com.kn.musicmanagement.pojo;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Integer id;
    private String user_ID;
    private String user_Name;
    private String user_Email;
    private String user_Password;
    private String user_Sex;
    private Integer user_Age;
    private String user_Avatar;
    private String user_Birthday;
    private String user_Introduction;
}
