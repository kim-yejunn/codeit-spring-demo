package com.example.demo;

import com.example.demo.i0708.AgilityHero;
import com.example.demo.i0708.Hero;
import com.example.demo.i0708.StrengthHero;
import lombok.ToString;

import java.util.Objects;


public class StrengthHeroRepository extends BasicHeroRepository {

    public StrengthHeroRepository(StrengthHero[] heroes){
        super(heroes);
    }


    /*    private List<StrengthHero> strengthHeroes = new ArrayList<>(Arrays.asList(
            new StrengthHero("AAA"),
            new StrengthHero("BBB"),
            new StrengthHero("CCC")
    ));*/

/*    @Override
    public Hero heroRead(String name) {
        for (StrengthHero each:strengthHeroes){
            if (each.getName().equals(name)){
                return each;
            }
        }
        throw new RuntimeException("당신이 찾는 영웅이 없습니다: "+name);
    }

    @Override
    public String heroCreate(String name) {
        for (StrengthHero each:strengthHeroes){
            if (each.getName().equals(name)){
                return "이미 있는 영웅입니다.";
            }
        }
        strengthHeroes.add(new StrengthHero(name));
        return (name+"의 영웅이 생성되었습니다.");
    }

    @Override
    public void heroUpdate(String name, String updateName) {
        StrengthHero target = null;
        for (StrengthHero each:strengthHeroes){
            if (each.getName().equals(name)){
                target = each;
                break;
            }
        }
        if (Objects.nonNull(target)){
            strengthHeroes.remove(target);
            strengthHeroes.add(new StrengthHero(updateName));
        }
    }

    @Override
    public void heroDelete(String name) {
        StrengthHero target = null;
        for (StrengthHero each:strengthHeroes){
            if (each.getName().equals(name)){
                target = each;
                break;
            }
        }
        if (Objects.nonNull(target)){
            strengthHeroes.remove(target);
        }
    }*/
}
