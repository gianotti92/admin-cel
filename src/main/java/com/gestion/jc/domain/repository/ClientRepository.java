package com.gestion.jc.domain.repository;

import com.gestion.jc.domain.client.Client;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface ClientRepository {
    Client save(Client client);
    List<Client> findAll(Pageable pageable);
}
