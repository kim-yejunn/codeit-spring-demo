package com.example.demo.i0708;

public class AgilityHero implements Hero {

    @Override
    public void attack() {
        System.out.println("빠른 연사 공격!");
    }

    @Override
    public void ultimate() {
        System.out.println("@@@@@회피 가동@@@@@");
    }
}
