package com.gestion.jc.service;

import com.gestion.jc.domain.Client;
import com.gestion.jc.repository.ClientRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> find(Pageable pageable) {
        return clientRepository.findAll(pageable).getContent();
    }
}
