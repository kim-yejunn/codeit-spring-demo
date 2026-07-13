package com.example.demo;

import com.example.demo.i0708.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        BasicHeroRepository HeroRepository = new AgilityHeroRepository(
                new AgilityHero[]{
                        new AgilityHero("Slark"),
                        new AgilityHero("Juggernaut"),
                        new AgilityHero("Drow Ranger")
                });

/*        HeroRepository heroRepository = new StrengthHeroRepository();
        String createHero = heroRepository.heroCreate("KYJ굿");

        System.out.println(createHero);
        System.out.println(heroRepository.toString());

        heroRepository.heroUpdate("KYJ굿", "KKKKKK");
        System.out.println(heroRepository.toString());

        heroRepository.heroDelete("AAA");
        System.out.println(heroRepository.toString());*/

/*      HeroRepository heroRepository = new AgilityHeroRepository();
        Hero selectedHero = heroRepository.heroRead("Slark");
        selectedHero.attack();
        selectedHero.ultimate();

        heroRepository = new StrengthHeroRepository();
        selectedHero = heroRepository.heroRead("AAA");
        selectedHero.attack();
        selectedHero.ultimate();*/

/*        PaymemtPrice pp = new PaymemtPrice("감자탕", 22000, 2500);

        pp.display();*/
    }
}