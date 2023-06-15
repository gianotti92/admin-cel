package com.gestion.jc.orders.infraestructure.mysqlpersistence;

import com.gestion.jc.orders.domain.Order;
import com.gestion.jc.clients.infraestructure.mysqlpersistence.ClientPersistenceMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ClientPersistenceMapper.class})
public interface OrderPersistenceMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "status", source = "status")
    @Mapping(target = "details", source = "details")
    @Mapping(target = "created", source = "created")
    @Mapping(target = "client", source = "client")
    @Mapping(target = "solved", source = "solved")
    OrderPersistenceDto map(Order order);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "status", source = "status")
    @Mapping(target = "details", source = "details")
    @Mapping(target = "created", source = "created")
    @Mapping(target = "client", source = "client")
    @Mapping(target = "solved", source = "solved")
    Order map(OrderPersistenceDto dto);
    
}
