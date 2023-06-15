package com.gestion.jc.orders.infraestructure.mockpersistence;

import com.gestion.jc.clients.domain.Client;
import com.gestion.jc.orders.domain.Order;
import com.gestion.jc.orders.domain.OrderRepository;
import com.gestion.jc.orders.domain.OrderStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@Profile(value = "mock")
@Slf4j
public class MockOrderRepository implements OrderRepository {
    @Override
    public Order save(Order order) {
        log.info("mock save order");
        return order.toBuilder().id(666L).build();
    }

    @Override
    public List<Order> findAll(Pageable pageable) {
        log.info("mock find all order");
        return List.of(
                Order.builder()
                        .id(666L)
                        .status(OrderStatus.IN_PROGRESS)
                        .solved(false)
                        .created(LocalDateTime.now())
                        .details("details")
                        .client(Client.builder()
                                .id(666L)
                                .name("mock name")
                                .hasWorkInProgress(true)
                                .extraData("extra data mock")
                                .build())
                        .build()
                
        );
    }
}
