package com.loooz.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loooz.bo.DiagnoseRecord;
import com.loooz.constants.DiagnoseState;
import com.loooz.constants.ErrorInfo;
import com.loooz.dao.DiagnoseRecordDao;
import com.loooz.exception.DiagnoseRecordException;
import com.loooz.service.DiagnoseRecordService;

@Service("diagnoseRecordService")
public class DiagnoseRecordServiceImpl implements DiagnoseRecordService {

    @Resource
    private DiagnoseRecordDao drDao;
    
    @Override
    public void registrationService(DiagnoseRecord dr) {
        // TODO Auto-generated method stub
        drDao.registration(dr);   
    }

    /* (non-Javadoc)
     * @see com.loooz.service.DiagnoseRecordService#checkDiagnoseRecord(long)
     * 检查诊断记录是否存在
     * 
     */
    @Override
    public boolean checkDiagnoseRecord(long drid) {
        // TODO Auto-generated method stub
        
        DiagnoseRecord dr = drDao.getDiagnsoeRecordById(drid);
        if(dr == null){
            return false;
        }else{
            return true;
        }
    }
    
    /* (non-Javadoc)
     * @see com.loooz.service.DiagnoseRecordService#diagnoseDoneService(com.loooz.bo.DiagnoseRecord)
     * 诊断结束
     */
    @Override
    public void diagnoseDoneService(long drid) throws DiagnoseRecordException{
        // TODO Auto-generated method stub
        
        if(drid <= 0){
            throw new DiagnoseRecordException(ErrorInfo.NON_EXIST_DIAGNOSE_RECORD);
        }
       
        DiagnoseRecord dr = drDao.getDiagnsoeRecordById(drid);
        if(dr == null ){
            throw new DiagnoseRecordException(ErrorInfo.NON_EXIST_DIAGNOSE_RECORD); 
        }
        
        //设置诊断完时间和状态
        dr.setEnd_time(new Date());
        dr.setState(DiagnoseState.DIAGNOSE_DONE.getState());
        
        drDao.diagnoseDone(dr);

    }

    
}
