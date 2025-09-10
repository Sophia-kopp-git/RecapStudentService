package org.example;

import lombok.With;
import org.example.Product;

import java.util.List;

@With
public record Order(
        String id,
        List<Product> products,
        OrderStatus orderStatus
) {
}
