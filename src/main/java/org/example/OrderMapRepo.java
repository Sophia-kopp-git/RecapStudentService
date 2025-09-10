package org.example;

import org.example.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OrderMapRepo implements OrderRepo{
    private Map<String, Order> orders = new HashMap<>();

    @Override
    public List<Order> getOrders() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public Order getOrderById(String id) {
        return orders.get(id);
    }

    @Override
    public Order addOrder(Order newOrder) {
        LocalDateTime dateTimeOrder = LocalDateTime.now();
        newOrder = newOrder.withDateTime(dateTimeOrder);
        orders.put(newOrder.id(), newOrder);
        return newOrder;
    }
    public Order updateOrderStatus(String id, OrderStatus orderStatus){
        Order selectedOrder = getOrderById(id);
        selectedOrder = selectedOrder.withOrderStatus(orderStatus);
        orders.replace(id, selectedOrder);
        return selectedOrder;
    }

    @Override
    public void removeOrder(String id) {
        orders.remove(id);
    }
}
