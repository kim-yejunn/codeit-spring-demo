package com.example.demo.i0709;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class Member {
    private final String citizen;
    private String name;
    private int age;

    public Member(String citizen, String name, int age){
        this.citizen = citizen;
        this.name = name;
        this.age = age;
    }

/*    public void setName(String name){
        this.name = name;
    }*/

    public void birthday(){
        this.age ++;
    }

/*    public String toString(){
        return this.citizen+this.name+this.age;
    }*/
}
