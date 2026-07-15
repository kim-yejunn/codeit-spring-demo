package com.example.demo.order;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaymentService {
    private final OrderRepository orderRepository;

    public Order payment(Integer orderId, String method){
        Order order = orderRepository.retrieve(orderId);
        order.pay(method);
        return orderRepository.update(order);
    }
}
