package com.gestion.jc.domain.order;

import com.gestion.jc.domain.client.Client;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
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