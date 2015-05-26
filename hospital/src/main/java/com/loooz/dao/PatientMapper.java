package com.loooz.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.loooz.bo.Patient;


@Repository
public interface PatientMapper {
    
    public void addPatient(Patient patient);
    
    public Patient selectByPid(long id);
    
    public void updatePatientInfo(Patient p);
    
    public List<Patient> getPatientList();
    
}
