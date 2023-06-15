package com.gestion.jc.clients.infraestructure.mysqlpersistence;

import com.gestion.jc.clients.infraestructure.mysqlpersistence.ClientPersistenceDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientJPARepository extends JpaRepository<ClientPersistenceDto, Long> {
}
