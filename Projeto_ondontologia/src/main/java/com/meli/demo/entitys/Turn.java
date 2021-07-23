package com.meli.demo.entitys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "turns")
@NoArgsConstructor
@Data
public class Turn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String day;

    @ManyToOne(optional = false)
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Diary diary;

    @ManyToOne(optional = false, cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private TurnStatus turnStatus;

    @ManyToOne(optional = false)
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Patient patient;
}
