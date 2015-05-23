package com.loooz.exception;

import com.loooz.constants.ErrorInfo;

/**
 * 
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月23日 下午5:22:10
 *
 */
public class BaseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2619751327894210215L;

	private ErrorInfo errorInfo;
	
	public BaseException(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	/**
	 * @return the errorInfo
	 */
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	/**
	 * @param errorInfo the errorInfo to set
	 */
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	
	public String getErrorMsg() {
		return this.errorInfo.getMsg();
	}
	
	public int getErrorCode() {
		return this.errorInfo.getErrorCode();
	}
}
