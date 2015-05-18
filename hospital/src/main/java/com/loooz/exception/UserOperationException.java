package com.loooz.exception;

public class UserOperationException extends Exception {

    /** 
    * @Fields serialVersionUID : TODO
    */
    private static final long serialVersionUID = 474300642472739941L;
    
    public UserOperationException(String errorMsg) {
        super(errorMsg);
    }
    
    public UserOperationException(String errorMsg, Throwable e) {
        super(errorMsg, e);
    }
}