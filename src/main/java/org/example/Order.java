package org.example;

import lombok.With;
import org.example.Product;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@With
public record Order(
        String id,
        List<Product> products,
        OrderStatus orderStatus,
        LocalDateTime dateTime
) {
    public Order(String id, List<Product> products, OrderStatus orderStatus) {
        this(id, products, orderStatus, LocalDateTime.now());
    }

}
