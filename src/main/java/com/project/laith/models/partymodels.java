package com.project.laith.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor

@Builder
@AllArgsConstructor
@Table
@Entity
public class partymodels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Integer id_party;
    @Column(
            name = "name"
    )
    private  String name;
    @Column(name = "price")
    private double price;
    @Column(name = "clock")
    private String clock;
}
