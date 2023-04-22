package com.gestion.jc.domain.repository;

import com.gestion.jc.domain.order.Order;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderRepository {
    Order save(Order order);
    List<Order> findAll(Pageable pageable);
}
