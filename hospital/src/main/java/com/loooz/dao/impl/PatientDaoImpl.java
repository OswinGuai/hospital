package com.loooz.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loooz.bo.Patient;
import com.loooz.dao.PatientDao;
import com.loooz.dao.PatientMapper;

@Service("patientDao")
public class PatientDaoImpl implements PatientDao {
    
    @Resource 
    private PatientMapper patientOperation;
    
    
    public void registerPatient(Patient patient) {
        // TODO Auto-generated method stub
        patientOperation.addPatient(patient);
    }
    
    /* (non-Javadoc)
     * @see com.loooz.dao.PatientDao#checkExistPatient(long)
     */
    @Override
    public boolean checkExistPatient(long pid) {
        // TODO Auto-generated method stub
        Patient p = patientOperation.selectByPid(pid);
        if(p == null){
            return false;
        }else{
            return true;
        }
    }

    /* (non-Javadoc)
     * @see com.loooz.dao.PatientDao#getPatientInfoByid(long)
     */
    @Override
    public Patient getPatientInfoByid(long pid) {
        // TODO Auto-generated method stub
        
        Patient p = patientOperation.selectByPid(pid);
        System.out.println("pid:"+p.getPid());
        return p;
    }

    /* (non-Javadoc)
     * @see com.loooz.dao.PatientDao#alertPatientInfoByid(long)
     * 修改病人信息
     */
    @Override
    public void alertPatientInfoByid(Patient p) {
        patientOperation.updatePatientInfo(p);
    }

    /* (non-Javadoc)
     * @see com.loooz.dao.PatientDao#getPatientList()
     * 获取所有病人
     */
    @Override
    public List<Patient> getPatientList() {
        List<Patient> pList = patientOperation.getPatientList();
        return pList;
    }

    
    
    
}
