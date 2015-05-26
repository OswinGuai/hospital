package com.loooz.service;

import java.util.List;

import net.sf.json.JSONObject;

import com.loooz.bo.Patient;
import com.loooz.exception.PatientOperationException;

/**
 * 
 * @description 患者相关操作 
 * @author Pei Zhongyi
 * @date 2015年5月23日 下午4:54:34
 *
 */
public interface PatientService {

	public void addPatient(Patient patient) throws PatientOperationException;
	
	public boolean checkExists(long patientId);
	
	public Patient getPatientById(long patientId);
	
	public void updatePatient(JSONObject p) throws PatientOperationException;
	
	public List<Patient> getAllPatientInfo();
}
