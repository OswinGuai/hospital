package com.loooz.exception;

import com.loooz.constants.ErrorInfo;

public class PatientOperationException extends BaseException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3151952609368576057L;

	public PatientOperationException(ErrorInfo errorInfo) {
        super(errorInfo);
    }
}