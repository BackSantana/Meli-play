package com.meli.demo.service;

import com.meli.demo.entitys.*;
import com.meli.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAll {

    @Autowired
    DentistRepository dentistRepository;

    @Autowired
    DiaryRepository diaryRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    TurnRepository turnRepository;

    @Autowired
    TurnStatusRepository turnStatusRepository;


    public void savePatient(Patient patient){
        patientRepository.save(patient);
    }

    public Patient getPatient(Long id){
        return patientRepository.getById(id);
    }

    public void saveDentist(Dentist dentist){
        dentistRepository.save(dentist);
    }

    public Dentist getDentist(Long id){
        return dentistRepository.getById(id);
    }

    public void saveDiary(Diary diary){
        diaryRepository.save(diary);
    }

    public Diary getDiary(Long id){
        return diaryRepository.findById(id).orElse(null);
    }

    public void saveTurn(Turn turn){
        turnRepository.save(turn);
    }

    public Turn getTurn(Long id){
        return turnRepository.getById(id);
    }


    public void teste(){
        List<Patient> patientList = patientRepository.findPatientsByTurnsDay("25");
    }
}
