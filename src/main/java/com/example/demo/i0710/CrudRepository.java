package com.example.demo.i0710;

public interface CrudRepository<T> {
    T heroCreate(T hero);

    T heroRead(String name);

    void heroUpdate(String name);

    void heroDelete(String name);
}
