package com.example.demo.i0710;

import com.example.demo.i0708.AgilityHero;

import java.util.ArrayList;

public class AgilityHeroRepository extends BasicHeroRepository<AgilityHero> {
    public AgilityHeroRepository(ArrayList<AgilityHero> heroes) {
        super(heroes);
    }

/*    private AgilityHero[] agilityHeroes = new AgilityHero[]{
            new AgilityHero("Slark"),
            new AgilityHero("Juggernaut"),
            new AgilityHero("Draw Ranger")
    };

    @Override
    public Hero heroRead(String name) {
        for (AgilityHero each:agilityHeroes){
            if (each.getName().equals(name)){
                return each;
            }
        }
        throw new RuntimeException("당신이 찾는 영웅은 존재하지 않습니다: "+name);
    }

    @Override
    public String heroCreate(String name) {
        return "";
    }

    @Override
    public void heroUpdate(String name, String updateName) {

    }

    @Override
    public void heroDelete(String name) {

    }*/

/*    @Override
    public void attack() {
        System.out.println("으아ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ");
    }

    @Override
    public void ultimate() {
        System.out.println("죽어ㅓㅓㅓㅓㅓㅓㅓㅓㅓㅓ");
    }*/
}
