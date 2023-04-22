package com.gestion.jc.infraestructure.client.adapter;

import com.gestion.jc.infraestructure.client.controller.dto.ClientDto;
import com.gestion.jc.infraestructure.client.controller.mapper.ClientMapper;
import com.gestion.jc.application.client.service.ClientService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClientAdapter {

    private ClientMapper clientMapper;
    private ClientService clientService;

    public ClientAdapter(ClientMapper clientMapper,
                         ClientService clientService) {
        this.clientMapper = clientMapper;
        this.clientService = clientService;
    }

    public ClientDto save(ClientDto dto){
        var result = clientService.save(clientMapper.map(dto));
        return clientMapper.map(result);
    }

    public List<ClientDto> find(Pageable pageable) {
        return clientService.find(pageable).stream()
                .map(clientMapper::map)
                .collect(Collectors.toList());
    }
}
