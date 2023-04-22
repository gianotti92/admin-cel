package com.gestion.jc.infraestructure.order.persistence;

import com.gestion.jc.domain.order.Order;
import com.gestion.jc.domain.repository.OrderRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class OrderMysqlRepository implements OrderRepository {
    
    private OrderPersistenceMapper mapper;
    private OrderJpaRepository orderJpaRepository;

    public OrderMysqlRepository(OrderPersistenceMapper mapper, OrderJpaRepository orderJpaRepository) {
        this.mapper = mapper;
        this.orderJpaRepository = orderJpaRepository;
    }

    @Override
    public Order save(Order order) {
        var orderToBePersisted = mapper.map(order);
        var orderPersisted = orderJpaRepository.save(orderToBePersisted);
        return mapper.map(orderPersisted);
    }

    @Override
    public List<Order> findAll(Pageable pageable) {
        return orderJpaRepository.findAll(pageable).getContent()
                .stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }
}
