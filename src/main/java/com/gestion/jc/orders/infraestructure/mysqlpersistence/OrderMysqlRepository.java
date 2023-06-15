package com.gestion.jc.orders.infraestructure.mysqlpersistence;

import com.gestion.jc.orders.domain.Order;
import com.gestion.jc.orders.domain.OrderRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@Profile(value = "local")
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
