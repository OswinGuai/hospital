package com.loooz.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loooz.bo.DiagnoseRecord;
import com.loooz.dao.DiagnoseRecordDao;
import com.loooz.dao.DiagnoseRecordMapper;

@Service("diagnoseRecordDao")
public class DiagnoseRecordDaoImpl implements DiagnoseRecordDao {

    @Resource
    private DiagnoseRecordMapper drOperation;
    
    
    //挂号
    @Override
    public void registration(DiagnoseRecord dr) {
        // TODO Auto-generated method stub
        drOperation.regisertion(dr);
    }

    @Override
    public void outCallPatient() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.loooz.dao.DiagnoseRecordDao#diagnoseDone(com.loooz.bo.DiagnoseRecord)
     * 
     * 诊断结束
     * 
     */
    @Override
    public void diagnoseDone(DiagnoseRecord dr) {
        // TODO Auto-generated method stub
        drOperation.updateDiagnoseDone(dr);
    }

    /* (non-Javadoc)
     * @see com.loooz.dao.DiagnoseRecordDao#getDiagnsoeRecordById(long)
     * 根据诊断记录ID获得诊断记录
     * 
     */
    @Override
    public DiagnoseRecord getDiagnsoeRecordById(long drid) {
        // TODO Auto-generated method stub
        return drOperation.getDiagnoseRecord(drid);
    }

}
