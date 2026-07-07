package com.example.demo;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

/*//@AllArgsConstructor
@Setter
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)*/
@Value
public class Member {
    Integer id;
    String name;
    int age = 200000;
    String email;
    @Singular
    List<String> favorites;

/*    @Builder
    public Member(String name, String email){
        this.name = name;
        this.email = email;
    }*/

/*
    public static Member from(MemberCreateRequestDto requestDto){
        return new Member(requestDto.getName(), requestDto.getEmail());
    }*/

/*    public Member(){}

    public void setName(String name){this.name = name;}
    public void setEmail(String email){this.email = email;}*/
}
