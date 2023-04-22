package com.gestion.jc.infraestructure.client.persistence;

import com.gestion.jc.domain.client.Client;
import com.gestion.jc.domain.repository.ClientRepository;
import com.gestion.jc.infraestructure.client.persistence.mapper.ClientPersistenceMapper;
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
