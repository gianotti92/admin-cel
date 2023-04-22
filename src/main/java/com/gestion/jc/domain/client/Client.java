package com.gestion.jc.domain.client;

import lombok.*;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Client {
    private Long id;
    private String name;
    private String contact;
    private String extraData;
    private Boolean hasWorkInProgress;
}
