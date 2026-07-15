package com.example.demo.order;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeliveryService {
    private final OrderRepository orderRepository;

    public Order departed(Integer orderId) {
        Order retrieved = orderRepository.retrieve(orderId);
        retrieved.departed();
        return orderRepository.update(retrieved);
    }

    public Order arrived(Integer orderId) {
        Order retrieved = orderRepository.retrieve(orderId);
        retrieved.arrived();
        return orderRepository.update(retrieved);
    }
}
