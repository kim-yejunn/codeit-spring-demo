package com.example.demo;

import lombok.*;

@AllArgsConstructor
public class OriginalPrice {
    protected String name;
    protected int price;

    public void display(){
        System.out.println(String.format("상품의 %s의 가격은 %s원 입니다", this.name, this.price));
    }
}
