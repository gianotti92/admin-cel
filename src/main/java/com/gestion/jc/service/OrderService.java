package com.gestion.jc.service;

import com.gestion.jc.domain.Order;
import com.gestion.jc.repository.OrderRepository;
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
        return orderRepository.findAll(pageable).getContent();
    }
}
