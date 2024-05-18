package com.spring.solo.mood.entity;

import com.spring.solo.mood.dto.UserDto;
import lombok.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userNo;
    private String userName;
    private String userId;
    private String userPass;
    private String userMail;
    private String userNickName;
    private int userAge;
    private String userAddress;
    private LocalDateTime regDateTime;


    public User(UserDto dto) {
        this.userName = dto.getUserName();
        this.userId = dto.getUserId();
        this.userPass = dto.getUserPass();
        this.userMail = dto.getUserMail();
        this.userNickName = dto.getUserNickName();
        this.userAge = dto.getUserAge();
        this.userAddress = dto.getUserAddress();
    }

    public User(ResultSet rs ) throws SQLException {
        this.userNo = rs.getString("user_no");
        this.userName = rs.getString("user_name");
        this.userId = rs.getString("user_id");
        this.userPass = rs.getString("user_password");
        this.userMail = rs.getString("user_email");
        this.userNickName = rs.getString("user_nickname");
        this.userAge = rs.getInt("user_age");
        this.userAddress = rs.getString("user_address");
        this.regDateTime = rs.getTimestamp("reg_date_time").toLocalDateTime();
    }
}
