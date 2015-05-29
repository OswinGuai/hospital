/**
 * 
 */
package com.loooz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.loooz.bo.Patient;
import com.loooz.constants.ErrorInfo;
import com.loooz.dao.PatientDao;
import com.loooz.exception.PatientOperationException;
import com.loooz.service.PatientService;

/**
 * 
 * @Description: TODO
 * @author Zhou Chong
 * @date 2015年5月23日 下午5:49:46
 */
@Service("patientService")
public class PatientServiceImpl implements PatientService {

    @Resource
    private PatientDao patientDao;
    
    
    /* (non-Javadoc)
     * @see com.loooz.service.PatientService#addPatient(com.loooz.bo.Patient)
     * 添加新注册的病人
     */
    public void addPatient(Patient patient) throws PatientOperationException{
        
        patientDao.registerPatient(patient);
      
    }

    /* (non-Javadoc)
     * @see com.loooz.service.PatientService#checkExists(long)
     * 检查patientId病人是否注册过
     */
    public boolean checkExists(long patientId) {
        // TODO Auto-generated method stub
        boolean isExist = patientDao.checkExistPatient(patientId);
        return isExist;
    }

    /* (non-Javadoc)
     * @see com.loooz.service.PatientService#getPatientById(long)
     * 获取patientId病人的信息
     */
    public Patient getPatientById(long patientId) {
        // TODO Auto-generated method stub
        Patient patient = patientDao.getPatientInfoByid(patientId);
        return patient;
    }

    /* (non-Javadoc)
     * @see com.loooz.service.PatientService#updatePatient(long)
     * 修改pid病人信息
     * 
     * json格式
     * {pid：？，name：？，cellphone：？，idcard:?,aid:?}
     * 
     */
    @Override
    public void updatePatient(JSONObject p) throws PatientOperationException {
        long pid = p.getLong("pid");
        System.out.println(pid);
        Assert.isTrue(pid > 0, "病人的pid不正确");
        
        Patient patient = patientDao.getPatientInfoByid(pid);
       
        if(patient == null){
            throw new PatientOperationException(ErrorInfo.NON_EXIST_PATIENT);
        }
        
        //姓名
        if(p.has("name")){
            patient.setName(p.getString("name"));
        }

        //电话
        if(p.has("cellphone")){
            patient.setCellphone(p.getString("cellphone"));
        }
        
        //身份证号
        if(p.has("idcard")){
            patient.setCellphone(p.getString("idcard"));
        }
        
        //支付宝账号
        if(p.has("aid")){
            patient.setCellphone(p.getString("aid"));
        }
        
        patientDao.alertPatientInfoByid(patient);
    }

    /* (non-Javadoc)
     * @see com.loooz.service.PatientService#getAllPatientInfo()
     * 获取所有的病人列表
     */
    @Override
    public List<Patient> getAllPatientInfo() {
        // TODO Auto-generated method stub
        List<Patient> plist = patientDao.getPatientList();
        return plist;
    }

    /* (non-Javadoc)
     * @see com.loooz.service.PatientService#getPatientListByAid(java.lang.String)
     * 获取同一aid下的所有患者
     */
    @Override
    public List<Patient> getPatientListByAid(String aid) {
        // TODO Auto-generated method stub
        
        List<Patient> patientListAid = patientDao.getPatientListById(aid);
        
        return patientListAid;
    }

    
    
}
