package com.loooz.exception;

import com.loooz.constants.ErrorInfo;

public class UserOperationException extends BaseException {

    /** 
    * @Fields serialVersionUID : TODO
    */
    private static final long serialVersionUID = 474300642472739941L;
    
    public UserOperationException(ErrorInfo errorInfo) {
        super(errorInfo);
    }
}