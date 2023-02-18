package com.gestion.jc.adapter;

import com.gestion.jc.dto.ClientDto;
import com.gestion.jc.mapper.ClientMapper;
import com.gestion.jc.service.ClientService;
import org.springframework.stereotype.Component;

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
}
