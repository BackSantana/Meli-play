package com.meli.demo.repository;

import com.meli.demo.entitys.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    /**
     * Listar todos os pacientes atendidos, em um dia, por todos os dentistas.
     * @param date
     * @return
     */
    public List<Patient> findPatientsByTurnsDay(String date);
}
