package com.example.demo;

import com.example.demo.i0708.Hero;

public interface HeroRepository {
    Hero heroCreate(Hero hero);

    String heroRead(String name);

    void heroUpdate(String name);

    void heroDelete(String name);
}
