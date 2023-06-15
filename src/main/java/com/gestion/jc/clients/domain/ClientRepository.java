package com.gestion.jc.clients.domain;

import com.gestion.jc.clients.domain.Client;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface ClientRepository {
    Client save(Client client);
    List<Client> findAll(Pageable pageable);
}
