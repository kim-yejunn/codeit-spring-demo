package com.example.demo;

import lombok.Value;

public class Calculator {
    public static final double TAX = 0.11;

    public static double calculate(int price){
        return TAX*price;
    }
}
