package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;

@ToString(callSuper = true, includeFieldNames = false)
@EqualsAndHashCode(callSuper = true)
public class Administrator extends Person {
    private String role;
    private LocalDate allocateAt;

    public Administrator(String name, int age, String role){
        super(name, age);
        this.role = role;
    }
}
