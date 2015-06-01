package com.loooz.dao;

import com.loooz.bo.DiagnoseRecord;

public interface DiagnoseRecordDao {
    
    //挂号
    public void registration(DiagnoseRecord dr);
   
    //出诊
    public void outCallPatient();
    
    //诊断结束
    public void diagnoseDone(DiagnoseRecord dr);
    
    //获取诊断记录
    public DiagnoseRecord getDiagnsoeRecordById(long drid);
     
}
