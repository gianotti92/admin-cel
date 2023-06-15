package com.gestion.jc.orders.domain;

import com.gestion.jc.clients.domain.Client;
import lombok.*;

import java.time.LocalDateTime;

@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Order {
    private Long id;
    private OrderStatus status;
    private String details;
    private LocalDateTime created;
    private Client client;
    private Boolean solved;
}