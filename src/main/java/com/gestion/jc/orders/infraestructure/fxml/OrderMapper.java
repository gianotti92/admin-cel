package com.gestion.jc.orders.infraestructure.fxml;

import com.gestion.jc.orders.domain.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "orderNumber", source = "id")
    @Mapping(target = "status", source = "status")
    @Mapping(target = "solved", source = "solved")
    @Mapping(target = "created",source = "created")
    @Mapping(target = "contact", expression = "java(\"nombre: \" + order.getClient().getName() + \"  \" + \"contacto: \"+ order.getClient().getContact() )")
    OrderDto map(Order order);
}
