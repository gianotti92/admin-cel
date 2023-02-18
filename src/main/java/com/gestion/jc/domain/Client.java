package com.gestion.jc.domain;

import lombok.*;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "client")
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "contact")
    private String contact;
    @Column(name = "extra_data")
    private String extraData;
    @Column(name = "has_work_in_progress")
    private Boolean hasWorkInProgress;

}
