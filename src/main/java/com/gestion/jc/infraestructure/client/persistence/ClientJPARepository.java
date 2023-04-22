package com.gestion.jc.infraestructure.client.persistence;

import com.gestion.jc.infraestructure.client.persistence.dto.ClientPersistenceDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientJPARepository extends JpaRepository<ClientPersistenceDto, Long> {
}
