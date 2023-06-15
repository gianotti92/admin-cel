package com.gestion.jc.clients.infraestructure.mockpersistence;

import com.gestion.jc.clients.domain.Client;
import com.gestion.jc.clients.domain.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@Profile(value = "mock")
public class MockClientRepository implements ClientRepository {
    @Override
    public Client save(Client client) {
        log.info("mock save client");
        return client.toBuilder().id(666L).build();
    }

    @Override
    public List<Client> findAll(Pageable pageable) {
        log.info("mock find all client");
        return List.of(Client.builder()
                .id(666L)
                .contact("mock contact")
                .hasWorkInProgress(false)
                .extraData("extra mock data")
                .name("mock name")
                .build());
    }
}
