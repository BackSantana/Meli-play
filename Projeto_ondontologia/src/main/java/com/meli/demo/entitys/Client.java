package com.meli.demo.entitys;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
@NoArgsConstructor
public class Client {
    private String name;
    private String lastName;
    private String adress;
    private String dni;
    private Date birthDate;
    private String phone;
    private String email;
    private String codeMp;
}
