package com.gestion.jc.application.order.service;

import com.gestion.jc.domain.order.Order;
import com.gestion.jc.domain.repository.OrderRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrder(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }
}
