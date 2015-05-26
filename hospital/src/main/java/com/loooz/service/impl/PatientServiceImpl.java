/**
 * 
 */
package com.loooz.service.impl;

import org.springframework.stereotype.Service;

import com.loooz.bo.Patient;
import com.loooz.service.PatientService;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月25日 下午5:59:17
 *
 */
@Service("patientService")
public class PatientServiceImpl implements PatientService {

//    @Resource
    
    /* (non-Javadoc)
     * @see com.loooz.service.PatientService#addPatient(com.loooz.bo.Patient)
     */
    @Override
    public void addPatient(Patient patient) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.loooz.service.PatientService#checkExists(long)
     */
    @Override
    public boolean checkExists(long patientId) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see com.loooz.service.PatientService#getPatientById(long)
     */
    @Override
    public Patient getPatientById(long patientId) {
        // TODO Auto-generated method stub
        return null;
    }

}
