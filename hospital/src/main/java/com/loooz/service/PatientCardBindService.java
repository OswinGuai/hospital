package com.loooz.service;

import com.loooz.bo.Patient;
import com.loooz.exception.CardOperationException;
import com.loooz.exception.PatientOperationException;

/**
 * 
 * @description 绑卡相关接口 
 * @author Pei Zhongyi
 * @date 2015年5月23日 下午4:43:54
 *
 */
public interface PatientCardBindService {

	public long generateBindCode(long patientId) throws PatientOperationException, CardOperationException;
	
	public void unbind(long patientId, String cardId);
	
	public Patient getBindPatient(long bindCode);
	
	public void bindCard(long bindCode, String cardId) throws CardOperationException;
}
