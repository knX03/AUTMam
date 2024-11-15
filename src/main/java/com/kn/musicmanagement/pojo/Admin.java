package com.kn.musicmanagement.pojo;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Admin {

    private Integer id;
    private String admin_ID;
    private String admin_Name;
    private String admin_Email;
    private String admin_Password;

}
