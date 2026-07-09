package com.example.demo;

import lombok.*;

@RequiredArgsConstructor
public class OneCoinGameService implements GameService {
    private final Hero hero;

    @Override
    public void play() {
        System.out.println("---------- Game Start ----------");
        this.hero.attack();
        this.hero.ultimate();
        System.out.println("---------- Game End ----------");
    }
}
