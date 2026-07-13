package com.example.demo;

public class PaymemtPrice extends OriginalPrice{
    private final static double TAX_RATE = 1.1;
    private int deliveryPrice;

    public PaymemtPrice(String name, int price, int deliveryPrice){
        super(name, price);
        this.deliveryPrice = deliveryPrice;
    }

    @Override
    public void display(){
        System.out.println(String.format("상품의 %s의 가격은 %s원에 배송비 %s원 입니다", super.name, (int)(super.price*TAX_RATE), deliveryPrice));
        System.out.println("총 가격: " + ((int)(super.price*TAX_RATE) + deliveryPrice));
    }
}
