package com.gestion.jc.service;

import com.gestion.jc.domain.Client;
import com.gestion.jc.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }
}
