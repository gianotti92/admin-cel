package com.gestion.jc.orders.infraestructure.mysqlpersistence;

import com.gestion.jc.orders.infraestructure.mysqlpersistence.OrderPersistenceDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<OrderPersistenceDto, Long> {
}
