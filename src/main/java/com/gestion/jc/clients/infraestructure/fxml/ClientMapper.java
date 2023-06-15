package com.gestion.jc.clients.infraestructure.fxml;

import com.gestion.jc.clients.domain.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mapping(target = "name", source = "name")
    @Mapping(target = "contact", source = "contact")
    @Mapping(target = "extraData", source = "extraData")
    @Mapping(target = "hasWorkInProgress", defaultValue = "false")
    Client map(ClientDto dto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "contact", source = "contact")
    @Mapping(target = "extraData", source = "extraData")
    ClientDto map(Client client);
}
