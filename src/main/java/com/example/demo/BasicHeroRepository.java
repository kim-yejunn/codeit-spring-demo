package com.example.demo;
import com.example.demo.i0708.Hero;
import lombok.Getter;

import java.util.Arrays;

@Getter
public abstract class BasicHeroRepository implements HeroRepository{

    // 배열, 래퍼런스 타입 => 주소값이 바뀌지 않기 때문에 final로 설정이 가능하지만 배열을 CRUD하면 배열을 새로 설정하기 때문에 final로 구성하면 어렵다..
    // 동적 사이즈로 동작하는 Collection은 final로 설정 가능

    private Hero[] heroes; // Hero 인터페이스로 다향성 지향해야 함

    public BasicHeroRepository(Hero[] heroes) {
        this.heroes = heroes;
    }

    @Override
    public Hero heroCreate(Hero hero) {
        for (Hero each:heroes){
            if (each.equals(hero)){
                break;
            }
        }
        Hero[] newhero = Arrays.copyOf(heroes, heroes.length+1);
        newhero[newhero.length-1] = hero;
        return null;
    }

    @Override
    public String heroRead(String name) {
        for (Hero each:heroes){
            if (each.getName().equals(name)){
                return String.format("존재하는 %s입니다.", name);
            }
        }
        return null;
    }

    @Override
    public void heroUpdate(String name) {

    }

    @Override
    public void heroDelete(String name) {

    }
}
