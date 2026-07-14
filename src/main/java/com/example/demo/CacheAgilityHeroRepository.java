package com.example.demo;

import com.example.demo.i0708.AgilityHero;
import com.example.demo.i0710.AgilityHeroRepository;
import com.example.demo.i0710.BasicHeroRepository;

public class CacheAgilityHeroRepository extends CacheBasicHeroRepository<AgilityHero> {
    public CacheAgilityHeroRepository(AgilityHero[] heroes) {
        super(new AgilityHeroRepository(heroes));
    }
}
