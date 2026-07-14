package com.example.demo;

import com.example.demo.i0708.*;
import com.example.demo.i0709.Game;
import com.example.demo.i0710.AgilityHeroRepository;
import com.example.demo.i0710.CrudRepository;
import com.example.demo.i0710.StrengthHeroRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {

        AgilityHero slark = new AgilityHero("Slark");

        CrudRepository<AgilityHero> cachRepository = new CacheAgilityHeroRepository(
                new AgilityHero[]{
                        new SuperAgilityHero(slark),
                        new AgilityHero("Drow Ranger")
                }
        );

        cachRepository.heroRead("Slark");
        cachRepository.heroRead("Slark");
        cachRepository.heroRead("HDoemd");

        Hero selectedHero = cachRepository.heroRead("Slark");

        GameService gameService = new TwoCoinGameService(selectedHero);
        gameService.play();

/*        MakingSinRamen sin = new MakingSinRamen();
        sin.boiling();*/

/*        CrudRepository<AgilityHero> crudRepository = new AgilityHeroRepository(
                new AgilityHero[]{
                        new AgilityHero("Slark"),
                        new AgilityHero("Juggernaut"),
                        new AgilityHero("Drow Ranger")
                });

        CrudRepository<StrengthHero> stcrudRepository = new StrengthHeroRepository(
                new StrengthHero[]{
                        new StrengthHero("Slark"),
                        new StrengthHero("Juggernaut"),
                        new StrengthHero("Drow Ranger")
                });

        crudRepository.heroCreate(new AgilityHero("AAAA"));
        crudRepository.heroDelete("Slark");
        Hero selectedHero = crudRepository.heroRead("Slark");

        GameService gameService = new TwoCoinGameService(selectedHero);
        gameService.play();*/

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