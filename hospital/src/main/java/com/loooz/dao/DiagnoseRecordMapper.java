package com.loooz.dao;

import org.springframework.stereotype.Repository;

import com.loooz.bo.DiagnoseRecord;

@Repository
public interface DiagnoseRecordMapper {
    
    //挂号
    public void regisertion(DiagnoseRecord dr);
    
    //诊断结束
    public void updateDiagnoseDone(DiagnoseRecord dr);
    
    //获取诊断记录
    public DiagnoseRecord getDiagnoseRecord(long drid);
    
   
}
