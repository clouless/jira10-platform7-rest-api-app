package io.codeclou.demo.services;

import io.codeclou.demo.model.OrderModel;
import io.codeclou.demo.model.SubOrderModel;

import java.util.ArrayList;
import java.util.List;

// SPRING-BEAN
public class OrderService {

    public OrderService() {

    }

    public List<OrderModel> getOrders() {
        OrderModel order1 = new OrderModel();
        order1.setOrderId("O-one");
        order1.setCustomerId("C-1");
        SubOrderModel sub1 = new SubOrderModel();
        sub1.setSubOrderDetails("customer want's it fast!");
        sub1.setSubOrderType("shipping");
        order1.setSubOrder(sub1);

        OrderModel order2 = new OrderModel();
        order2.setOrderId("O-two");
        order2.setCustomerId("C-2");
        SubOrderModel sub2 = new SubOrderModel();
        order2.setSubOrder(sub2); // <=== Problem 1: Why is it not reflected in JSON?

        OrderModel order3 = new OrderModel();
        order3.setOrderId("O-three");
        order3.setCustomerId(null);// <=== Problem 2: Why is it not reflected in JSON?

        List<OrderModel> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        return orders;
    }
}
