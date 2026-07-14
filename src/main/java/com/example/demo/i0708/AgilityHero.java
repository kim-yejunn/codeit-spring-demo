package com.example.demo.i0708;

import com.example.demo.i0710.BasicHeroInformation;


public class AgilityHero extends BasicHeroInformation {
    public AgilityHero(String name) {
        super(name);
    }
/*    @Getter
    private String name;*/

/*    public AgilityHero(String name){
        this.name = name;
    }*/


    @Override
    public void attack() {
        System.out.println("빠른 연사 공격!");
    }

    @Override
    public void ultimate() {
        System.out.println("@@@@@회피 가동@@@@@");
    }
}
