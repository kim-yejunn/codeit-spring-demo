package com.example.demo.order;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public Order create(String product){
        return orderRepository.create(product);
    }

    public Order craete(String product) {
        return orderRepository.create(product);
    }
}
