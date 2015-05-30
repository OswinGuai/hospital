package com.loooz.exception;

import com.loooz.constants.ErrorInfo;

public class EvaluationOperationException extends BaseException {

    /**
     * 
     */
    private static final long serialVersionUID = 3687055566022497444L;

    public EvaluationOperationException(ErrorInfo errorInfo) {
        super(errorInfo);
    }
}