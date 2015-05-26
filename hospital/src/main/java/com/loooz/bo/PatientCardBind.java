package com.loooz.bo;

import java.io.Serializable;
import java.sql.Date;

/**
 * 
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月23日 下午5:03:50
 *
 */
public class PatientCardBind implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8703147666532066847L;

	private long bindCode;
	private long patientId;
	private String cardId;
	private Date bindTime;
	private int state;
	
	/**
	 * @return the bindCode
	 */
	public long getBindCode() {
		return bindCode;
	}
	/**
	 * @param bindCode the bindCode to set
	 */
	public void setBindCode(long bindCode) {
		this.bindCode = bindCode;
	}
	/**
	 * @return the patientId
	 */
	public long getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	/**
	 * @return the cardId
	 */
	public String getCardId() {
		return cardId;
	}
	/**
	 * @param cardId the cardId to set
	 */
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	/**
	 * @return the bindTime
	 */
	public Date getBindTime() {
		return bindTime;
	}
	/**
	 * @param bindTime the bindTime to set
	 */
	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
	}
	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}
	
}
