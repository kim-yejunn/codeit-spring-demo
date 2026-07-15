package com.example.demo.i0711;

import com.example.demo.i0708.Hero;
import com.example.demo.i0710.BasicHeroRepository;
import com.example.demo.i0710.CrudRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CacheBasicHeroRepository<T extends Hero> implements CrudRepository<T> {
    private List<T> heroes = new ArrayList<>();
    private final BasicHeroRepository<T> database;

    public CacheBasicHeroRepository(BasicHeroRepository<T> database){
        this.database = database;
    }

    @Override
    public T heroCreate(T hero) {
        return null;
    }

    @Override
    public T heroRead(String name) {
        for (T each : this.heroes) {
            if (each.getName().equals(name)) {
                System.out.println("- 캐시로부터 반환 완료: "+name);
                return each;
            }
        }
        T retrievdFromDatabase = this.database.heroRead(name);
        if (Objects.isNull(retrievdFromDatabase)){
            System.out.println("- 데이터베이스에 존재하지 않습니다: "+name);
            return null;
        }
        this.heroes.add(retrievdFromDatabase);
        System.out.println("- 캐시에는 없지만 데이터베이스에는 존재하여 캐시에 싱크 후 반환!: "+ name);
        return retrievdFromDatabase;
    }

    @Override
    public void heroUpdate(String name) {

    }

    @Override
    public void heroDelete(String name) {

    }
}
