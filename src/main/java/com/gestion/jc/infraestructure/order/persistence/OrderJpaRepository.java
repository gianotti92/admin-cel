package com.gestion.jc.infraestructure.order.persistence;

import com.gestion.jc.infraestructure.order.persistence.dto.OrderPersistenceDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<OrderPersistenceDto, Long> {
}
