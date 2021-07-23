package com.meli.demo.entitys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "diarys")
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endingTime;
    @ManyToOne(optional = false)
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Dentist dentist;
}
