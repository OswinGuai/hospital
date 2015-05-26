/**
 * 
 */
package com.loooz.dao;

import com.loooz.bo.PatientCardBind;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月23日 下午5:51:14
 *
 */
public interface PatientCardBindDao {

	public PatientCardBind selectBindRecordByPatientId(long patientId);
	
	public PatientCardBind selectBindRecordByBindCode(long bindCode);
	
	public void insertBindRecord(PatientCardBind record);
	
	public void updateBindRecordByKey(PatientCardBind record);
}
