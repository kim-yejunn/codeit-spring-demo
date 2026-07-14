package com.example.demo.i0710;

import com.example.demo.i0708.Hero;

public interface HeroRepository<T extends Hero> extends CrudRepository<T> {
}
