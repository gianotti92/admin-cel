package com.gestion.jc.mapper;

import com.gestion.jc.domain.Client;
import com.gestion.jc.dto.ClientDto;
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
