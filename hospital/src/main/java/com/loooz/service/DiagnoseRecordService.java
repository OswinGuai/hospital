package com.loooz.service;

import com.loooz.bo.DiagnoseRecord;
import com.loooz.exception.DiagnoseRecordException;

public interface DiagnoseRecordService {
    
    public void registrationService(DiagnoseRecord dr);
    
    public boolean checkDiagnoseRecord(long drid);
    
    public void diagnoseDoneService(long drid) throws DiagnoseRecordException;
    
}
