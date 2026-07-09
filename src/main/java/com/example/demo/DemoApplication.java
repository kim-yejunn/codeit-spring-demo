package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        Hero sthero = new StrengthHero();
        Hero aghero = new AgilityHero();
        GameService gameService = new OneCoinGameService(sthero);
        gameService.play();
        GameService twogameService = new TwoCoinGameService(aghero);
        twogameService.play();
        StrengthHero sthh = new StrengthHero();
        sthh.additonal();
/*        System.out.println(Calculator.calculate(1000));
        System.out.println(Calculator.calculate(2000));*/
    }
}