package com.meli.demo.entitys;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "dentists")
public class Dentist extends Client{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dentist")
    private Long id;
}
