package com.loooz.exception;

import com.loooz.constants.ErrorInfo;

public class CardOperationException extends BaseException {

	/**
     * 
     */
    private static final long serialVersionUID = -1427931539298415822L;

    public CardOperationException(ErrorInfo errorInfo) {
        super(errorInfo);
    }
}