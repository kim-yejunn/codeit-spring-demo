package com.example.demo.i0710;

import com.example.demo.i0708.Hero;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class BasicHeroInformation implements Hero {
    private String name;

    public BasicHeroInformation(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
}
