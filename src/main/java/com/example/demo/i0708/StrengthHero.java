package com.example.demo.i0708;

public class StrengthHero implements Hero{

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
