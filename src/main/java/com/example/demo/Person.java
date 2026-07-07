package com.example.demo;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
//@AllArgsConstructor(access = AccessLevel.PUBLIC)
@RequiredArgsConstructor
@ToString(includeFieldNames = false)
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Person {
    String name;
    int age;


    /*    public String toString(){
        return String.format("Member(name=%s, age=%s)", name, age);
    }*/

    /*    public String getName(){return this.name;}
    public int getAge(){return this.age;}*/

    /*    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }*/


}
