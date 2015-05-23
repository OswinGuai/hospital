package com.loooz.exception;

public class PatientOperationException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3151952609368576057L;

	public PatientOperationException(String errorMsg) {
        super(errorMsg);
    }
    
    public PatientOperationException(String errorMsg, Throwable e) {
        super(errorMsg, e);
    }
}