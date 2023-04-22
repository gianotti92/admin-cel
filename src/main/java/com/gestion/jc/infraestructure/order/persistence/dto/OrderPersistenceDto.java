package com.gestion.jc.infraestructure.order.persistence.dto;

import com.gestion.jc.domain.client.Client;
import com.gestion.jc.domain.order.OrderStatus;
import com.gestion.jc.infraestructure.client.persistence.dto.ClientPersistenceDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "order_request")
@Entity
public class OrderPersistenceDto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "status")
    private String status;
    @Column(name = "details")
    private String details;
    @Column(name = "creation_date")
    private LocalDateTime created;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private ClientPersistenceDto client;
    @Column(name = "solved")
    private Boolean solved;
}
