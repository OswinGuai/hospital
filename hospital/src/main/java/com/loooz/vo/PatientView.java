/**
 * 
 */
package com.loooz.vo;

import com.loooz.bo.Patient;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年6月1日 下午5:56:43
 *
 */
public class PatientView extends Patient {

    /**
     * 
     */
    private static final long serialVersionUID = -649096974910606488L;

    private boolean hasBoundCard = false;
    
//    public PatientView(Patient patient) {
//        super.setAid(patient.getAid());
//        super.setCellphone(patient.getCellphone());
//        super.setIdcard(patient.getIdcard());
//        super.setName(patient.getName());
//        super.setPid(patient.getPid());
//    }
    
    /**
     * @return the hasBoundCard
     */
    public boolean isHasBoundCard() {
        return hasBoundCard;
    }

    /**
     * @param hasBoundCard the hasBoundCard to set
     */
    public void setHasBoundCard(boolean hasBoundCard) {
        this.hasBoundCard = hasBoundCard;
    }
}
