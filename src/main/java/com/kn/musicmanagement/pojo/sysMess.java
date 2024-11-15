package com.kn.musicmanagement.pojo;

import lombok.*;
import java.sql.Timestamp;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class sysMess {
    private String user_ID;
    private String mess_text;
    private Timestamp mess_time;
}
