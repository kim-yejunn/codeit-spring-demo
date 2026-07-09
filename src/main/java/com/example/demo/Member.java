package com.example.demo;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@ToString
public class Member {
    public static String MEMBER_TO_STRING_FORMAT = "Member(id=%s, name=%s, age=%s, email=%s)";

    private Integer id;
    private String name;
    private int age;
    private String email;

    public String toString() {
        return String.format(MEMBER_TO_STRING_FORMAT, this.id, this.name, this.age, this.email);
    }

    public static String toString(Member member) {
        return String.format(MEMBER_TO_STRING_FORMAT, member.id, member.name, member.age, member.email);
    }

    public static void main(String[] args) {
        System.out.println(Calculator.calculate(1203013));
    }
}
