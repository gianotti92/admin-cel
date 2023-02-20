package com.gestion.jc.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class OrderDto {
    private String orderNumber;
    private String status;
    private Boolean solved;
    private String created;
    private String contact;
}
