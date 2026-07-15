package com.example.demo.i0711;

import com.example.demo.i0708.AgilityHero;
import com.example.demo.i0710.AgilityHeroRepository;

import java.util.ArrayList;

public class CacheAgilityHeroRepository extends CacheBasicHeroRepository<AgilityHero> {

    public CacheAgilityHeroRepository(ArrayList<AgilityHero> heroes) {
        super(new AgilityHeroRepository(heroes));
    }
}
