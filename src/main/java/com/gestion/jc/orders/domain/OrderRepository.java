package com.gestion.jc.orders.domain;

import com.gestion.jc.orders.domain.Order;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderRepository {
    Order save(Order order);
    List<Order> findAll(Pageable pageable);
}
