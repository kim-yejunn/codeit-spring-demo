package com.example.demo.i0708;

import com.example.demo.i0710.BasicHeroInformation;
import lombok.ToString;

@ToString
public class StrengthHero extends BasicHeroInformation {
/*    @Getter
    private String name;*/

    public StrengthHero(String name) {
        super(name);
    }

/*    public StrengthHero(String name){
        this.name = name;
    }*/

    @Override
    public void attack() {
        System.out.println("강한 공격!");
    }

    @Override
    public void ultimate() {
        System.out.println("@@@@@분노의 일추가@@@@@");
    }

    public void additonal() {
        System.out.println("추가 공격 진행");
    }
}
