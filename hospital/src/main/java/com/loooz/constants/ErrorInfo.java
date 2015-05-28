/**
 * 
 */
package com.loooz.constants;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月23日 下午5:11:02
 *
 */
public enum ErrorInfo {
	NON_EXIST_PATIENT(2001,"患者不存在"),
	NON_EXIST_USER(2002,"用户不存在"),
	ALIPAY_ID_EMPTY(2003,"用户支付宝ID不能为空"),
	CANNOT_ADD_EXISTING_USER(2004,"不能添加已经存在的用户"),
	CANNOT_REBIND_PATIENT(2005,"不能给患者重复绑定"),
	CANNOT_ADD_PATIENT(3005,"注册不成功"),
    ADD_PATIENT_SUCCESS(3006,"注册成功"),
	NON_EXIST_DIAGNOSE_RECORD(4001,"就诊记录不存在");
	
	
	private int errorCode;
	private String msg;
	
	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	private ErrorInfo(int errorCode, String msg) {
		this.errorCode = errorCode;
		this.msg = msg;
	}
}
