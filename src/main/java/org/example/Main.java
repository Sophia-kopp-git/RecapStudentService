package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        ShopService shopService = new ShopService();

        Product shampoo = new Product("2", "Shampoo");
        Product toothPaste = new Product("3", "Tooth paste");
        shopService.addProduct(shampoo);
        shopService.addProduct(toothPaste);

        List<String> products = new ArrayList<>();
        products.add("1");
        products.add("2");
        //products.add("5");

        shopService.addOrder(products);

        System.out.println(shopService.getAllOrdersOfSelectedOrderStatus(OrderStatus.PROCESSING).toString());
        List<Order> orders = shopService.getAllOrders();
        String orderId = orders.get(0).id();

        shopService.updateOrderStatus(orderId, OrderStatus.IN_DELIVERY);
        System.out.println(shopService.getAllOrders().toString());
        System.out.println(shopService.getAllOrdersOfSelectedOrderStatus(OrderStatus.IN_DELIVERY).toString());
    }
}