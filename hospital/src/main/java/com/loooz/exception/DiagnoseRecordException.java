package com.loooz.exception;

import com.loooz.constants.ErrorInfo;

public class DiagnoseRecordException extends BaseException {

    /** 
    * @Fields serialVersionUID : TODO
    */
    private static final long serialVersionUID = -1963881605291647962L;
    
    public DiagnoseRecordException(ErrorInfo errorInfo){
        super(errorInfo);
    }
    


}
