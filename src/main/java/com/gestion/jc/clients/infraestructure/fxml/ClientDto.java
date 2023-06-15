package com.gestion.jc.clients.infraestructure.fxml;

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
