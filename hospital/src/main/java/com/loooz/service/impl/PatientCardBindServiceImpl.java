/**
 * 
 */
package com.loooz.service.impl;

import javax.annotation.Resource;

import com.loooz.bo.Patient;
import com.loooz.bo.PatientCardBind;
import com.loooz.constants.ErrorInfo;
import com.loooz.dao.PatientCardBindDao;
import com.loooz.exception.PatientOperationException;
import com.loooz.service.PatientCardBindService;
import com.loooz.service.PatientService;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月23日 下午4:52:49
 *
 */
public class PatientCardBindServiceImpl implements PatientCardBindService {

	@Resource
	private PatientService patientService;
	
	@Resource
	private PatientCardBindDao patientCardBindDao;
	
	
	/* (non-Javadoc)
	 * @see com.loooz.service.BindCardService#generateBindCode(long)
	 */
	@Override
	public long generateBindCode(long patientId) throws PatientOperationException {
		if (!patientService.checkExists(patientId)) {
			throw new PatientOperationException(ErrorInfo.NON_EXIST_PATIENT);
		}
		if (patientCardBindDao.getBindByPatientId(patientId) != null) {
			throw new PatientOperationException(ErrorInfo.CANNOT_REBIND_PATIENT);
		}
		PatientCardBind record = new PatientCardBind();
		record.setPatientId(patientId);
		patientCardBindDao.insertBindRecord(record);
		return record.getId();
	}

	/* (non-Javadoc)
	 * @see com.loooz.service.BindCardService#unbind(long, java.lang.String)
	 */
	@Override
	public void unbind(long patientId, String cardId) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.loooz.service.BindCardService#getBindPatient(long)
	 */
	@Override
	public Patient getBindPatient(long bindCode) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.loooz.service.BindCardService#registerCard(long, java.lang.String)
	 */
	@Override
	public void registerCard(long bindCode, String cardId) {
		// TODO Auto-generated method stub

	}

}
