package com.gestion.jc.infraestructure.client.controller.mapper;

import com.gestion.jc.domain.client.Client;
import com.gestion.jc.infraestructure.client.controller.dto.ClientDto;
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
