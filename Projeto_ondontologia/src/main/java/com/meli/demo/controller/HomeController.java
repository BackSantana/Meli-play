package com.meli.demo.controller;

import com.meli.demo.entitys.Dentist;
import com.meli.demo.entitys.Diary;
import com.meli.demo.entitys.Patient;
import com.meli.demo.entitys.Turn;
import com.meli.demo.service.ServiceAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    ServiceAll serviceAll;

    @PostMapping("/patient")
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient){
        serviceAll.savePatient(patient);
        return ResponseEntity.ok().body(serviceAll.getPatient(patient.getId()));
    }

    @PostMapping("/dentist")
    public ResponseEntity<Dentist> saveDentist(@RequestBody Dentist dentist){
        serviceAll.saveDentist(dentist);
        return ResponseEntity.ok().body(serviceAll.getDentist(dentist.getId()));
    }

    @PostMapping("/diary/{dentistId}")
    public ResponseEntity<Diary> iniciaDiaria(@PathVariable Long dentistId, @RequestBody Diary diary){
        Dentist dentist = serviceAll.getDentist(dentistId);
        diary.setDentist(dentist);
        serviceAll.saveDiary(diary);
        return ResponseEntity.ok().body(serviceAll.getDiary(diary.getId()));
    }

    @PostMapping("/turn/patientId/{patientId}/diaryId/{diaryId}")
    public ResponseEntity<Turn> iniciaTurn(@PathVariable Long diaryId, @PathVariable Long patientId, @RequestBody Turn turn){
        Patient patient = serviceAll.getPatient(patientId);
        Diary diary = serviceAll.getDiary(diaryId);

        turn.setDiary(diary);
        turn.setPatient(patient);

        serviceAll.saveTurn(turn);
        serviceAll.teste();
        return ResponseEntity.ok().body(serviceAll.getTurn(turn.getId()));
    }
}
