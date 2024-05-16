package com.project.laith.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class party_of_client {
    private UUID id;
    private  client client;
    private  partymodels partymodels;
}
