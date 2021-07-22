package com.meli.demo.entitys;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "turns")
@NoArgsConstructor
@Data
public class Turn {
}
