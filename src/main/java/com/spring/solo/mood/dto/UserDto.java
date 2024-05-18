package com.spring.solo.mood.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserDto {
    private String userName;
    private String userId;
    private String userPass;
    private String userMail;
    private String userNickName;
    private int userAge;
    private String userAddress;
}
