package com.example.demo.i0709;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Game {
    String[] name;
    int count;

    public String[] play(){
        System.out.println("--- Players ---");
        for (String each:name){
            System.out.println(each);
        }
        System.out.println("--- Game Finish ---");
        return new String[]{"Arron", "12:10:10", "10 time items"};
    }
}
