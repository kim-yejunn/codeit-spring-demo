package com.example.demo.lombok;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Getter
public class GameController {
    String[] member;
    Integer count;

    public void play(){
        System.out.println(member.length+"와 함께 플레이했습니다.");
        System.out.println((count-5)+"회 승리 후 종료되었습니다.");
    }

}
