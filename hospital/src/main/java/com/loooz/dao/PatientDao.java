package com.loooz.dao;

import java.util.List;

import com.loooz.bo.Patient;

public interface PatientDao {
    //注册信息
    public void registerPatient(Patient patient);
    
    //检查病人是否存在
    public boolean checkExistPatient(long pid);
    
    //获得病人信息
    public Patient getPatientInfoByid(long pid);
    
    //修改病人信息
    public void alertPatientInfoByid(Patient p);
    
    //获取所有病人
    public List<Patient> getPatientList();
   
}
