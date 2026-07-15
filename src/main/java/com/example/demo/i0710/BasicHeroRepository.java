package com.example.demo.i0710;
import com.example.demo.i0708.Hero;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Getter
public abstract class BasicHeroRepository<T extends Hero> implements HeroRepository<T> {

    // 배열, 래퍼런스 타입 => 주소값이 바뀌지 않기 때문에 final로 설정이 가능하지만 배열을 CRUD하면 배열을 새로 설정하기 때문에 final로 구성하면 어렵다..
    // 동적 사이즈로 동작하는 Collection은 final로 설정 가능

    private List<T> heroes = new ArrayList<>(); // Hero 인터페이스로 다향성 지향해야 함

    public BasicHeroRepository(List<T> heroes) {
        this.heroes = heroes;
    }

    @Override
    public T heroCreate(T hero) {
        for (T each:heroes){
            if (each.equals(hero)){
                break;
            }
        }
        this.heroes.add(hero);
        return null;
    }

    @Override
    public T heroRead(String name) {
        for (T each : this.heroes) {
            if (each.getName().equals(name)) {
                return each;
            }
        }
        return null;
    }

    @Override
    public void heroUpdate(String name) {

    }

    @Override
    public void heroDelete(String name) {
        T retrieve = heroRead(name);
        if (Objects.isNull(retrieve)) {
            throw new RuntimeException("지우시려는 이름의 영웅이 기존에 없습니다! - 입력받은 영웅 : " + name);
        }else {
            heroes.add(retrieve);
        }
    }
}
