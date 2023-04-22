package com.gestion.jc.infraestructure.client.persistence.mapper;

import com.gestion.jc.domain.client.Client;
import com.gestion.jc.infraestructure.client.persistence.dto.ClientPersistenceDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientPersistenceMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "contact", source = "contact")
    @Mapping(target = "extraData", source = "extraData")
    @Mapping(target = "hasWorkInProgress", source = "hasWorkInProgress")
    ClientPersistenceDto map(Client client);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "contact", source = "contact")
    @Mapping(target = "extraData", source = "extraData")
    @Mapping(target = "hasWorkInProgress", source = "hasWorkInProgress")
    Client map(ClientPersistenceDto dto);
    
    
}
