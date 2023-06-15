package com.gestion.jc.clients.infraestructure.mysqlpersistence;

import com.gestion.jc.clients.domain.Client;
import com.gestion.jc.clients.domain.ClientRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ClientMysqlRepository implements ClientRepository {
    
    private ClientPersistenceMapper mapper;
    private ClientJPARepository clientJPARepository;

    public ClientMysqlRepository(ClientPersistenceMapper mapper,
                                 ClientJPARepository clientJPARepository) {
        this.mapper = mapper;
        this.clientJPARepository = clientJPARepository;
    }

    @Override
    public Client save(Client client) {
        var clientToBePersisted = mapper.map(client);
        var clientPersisted = clientJPARepository.save(clientToBePersisted);
        return mapper.map(clientPersisted);
    }

    @Override
    public List<Client> findAll(Pageable pageable) {
        return clientJPARepository.findAll(pageable).getContent().stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }
}
