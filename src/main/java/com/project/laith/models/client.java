package com.project.laith.models;



import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@NoArgsConstructor
 @AllArgsConstructor
@Data
@Setter
@Getter

@Table
@Entity

public class client {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE )

    private Integer id_client;
    @Column
    private  String name;



}
