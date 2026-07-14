package com.example.demo;

import com.example.demo.i0708.AgilityHero;
import lombok.RequiredArgsConstructor;

public class SuperAgilityHero extends AgilityHero {
    private final AgilityHero actual;

    public SuperAgilityHero(AgilityHero actual) {
        super(actual.getName());
        this.actual = actual;
    }

    @Override
    public void attack(){
        this.actual.attack();
        this.actual.attack();
    }

    @Override
    public void ultimate(){
        this.actual.ultimate();
        this.actual.ultimate();
        this.actual.ultimate();
    }
}
