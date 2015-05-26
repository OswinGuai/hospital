/**
 * 
 */
package com.loooz.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loooz.bo.PatientCardBind;
import com.loooz.dao.PatientCardBindDao;
import com.loooz.dao.PatientCardBindMapper;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月25日 下午5:56:38
 *
 */
@Service("patientCardBindDao")
public class PatientCardBindDaoImpl implements PatientCardBindDao {

    @Resource
    private PatientCardBindMapper mapper;
    
    /* (non-Javadoc)
     * @see com.loooz.dao.PatientCardBindDao#getBindByPatientId(long)
     */
    @Override
    public PatientCardBind getBindByPatientId(long patientId) {
        return mapper.getBindByPatientId(patientId);
    }

    /* (non-Javadoc)
     * @see com.loooz.dao.PatientCardBindDao#insertBindRecord(com.loooz.bo.PatientCardBind)
     */
    @Override
    public void insertBindRecord(PatientCardBind record) {
        mapper.insertBindRecord(record);
    }

}
