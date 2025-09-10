package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ShopService shopService = new ShopService();
        ProductRepo productRepo = new ProductRepo();

        Product shampoo = new Product("2", "Shampoo");
        Product toothPaste = new Product("3", "Tooth paste");
        productRepo.addProduct(shampoo);
        productRepo.addProduct(toothPaste);


        //List<Product> products = new ArrayList<>(Arrays.asList(shampoo, toothPaste));
        //Order order1 = new Order("1", products, OrderStatus.PROCESSING);
        List<String> products = new ArrayList<>();
        products.add("1");
        products.add("2");

        shopService.addOrder(products);

        System.out.println(shopService.getAllOrdersOfSelectedOrderStatus(OrderStatus.PROCESSING).toString());
    }
}