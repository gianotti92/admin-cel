package com.gestion.jc.infraestructure.client.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ClientDto {
    private Long id;
    private String name;
    private String contact;
    private String extraData;
    private Boolean hasWorkInProgress;
}
