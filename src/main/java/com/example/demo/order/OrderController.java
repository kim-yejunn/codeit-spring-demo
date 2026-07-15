package com.example.demo.order;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final PaymentService paymentService;
    private final DeliveryService deliveryService;

    public void process(){
        // 1. 구매 페이지
        String product = "MacBook Pro";
        Order order = orderService.craete(product);
        Integer orderId = order.getId();
        System.out.println(order);

        // 2. 결제 페이지
        String method = PaymentMethod.CARD.getMethod();
        paymentService.payment(orderId, method);
        System.out.println(order);

        // 3. 배송 페이지
        deliveryService.departed(orderId);
        System.out.println(order);

        deliveryService.arrived(orderId);
        System.out.println(order);
    }
}
