/**
 * 
 */
package com.loooz.dao;

import org.springframework.stereotype.Repository;

import com.loooz.bo.PatientCardBind;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月23日 下午5:37:26
 *
 */
@Repository
public interface PatientCardBindMapper {

	public PatientCardBind selectBindRecordByPatientId(long patientId);
	
	public PatientCardBind selectBindRecordByBindCode(long bindCode);
	
	public void insertBindRecord(PatientCardBind record);
	
	public void updateBindRecordByKey(PatientCardBind record);
}
