package com.example.demo.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
@Getter
public class Order {
    private final Integer id = 1;
    private final String product;
    private String measure;
    private String status = "PENDING_PAYMENT";

    public void pay(String measure) {
        this.measure = measure;
        this.status = "COMPLETE_PAYMENT";
    }

    public void departed() {
        this.status = "DELIVERY_DEPARTED";
    }

    public void arrived() {
        this.status = "DELIVERY_ARRIVED";
    }
}
