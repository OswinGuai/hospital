package com.loooz.service;

import com.loooz.bo.Patient;

/**
 * 
 * @description 患者相关操作 
 * @author Pei Zhongyi
 * @date 2015年5月23日 下午4:54:34
 *
 */
public interface PatientService {

	public void addPatient(Patient patient);
	
	public boolean checkExists(long patientId);
	
	public Patient getPatientById(long patientId);
}
