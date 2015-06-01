package com.loooz.bo;

import java.io.Serializable;
import java.util.Date;

public class DiagnoseRecord implements Serializable {
  
    /** 
    * @Fields serialVersionUID : TODO
    */
    private static final long serialVersionUID = -8257614627760759774L;

    //记录id
    private long rid;
    
    //开始时间
    private Date start_time;
    
    //结束时间
    private Date end_time;
    
    //状态
    private int state;
    
    //患者ID
    private long pid;
    
    //诊断类型
    private int diagnose_type;

    /**
     * @return the rid
     */
    public long getRid() {
        return rid;
    }

    /**
     * @param rid the rid to set
     */
    public void setRid(long rid) {
        this.rid = rid;
    }

    /**
     * @return the start_time
     */
    public Date getStart_time() {
        return start_time;
    }

    /**
     * @param start_time the start_time to set
     */
    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    /**
     * @return the end_time
     */
    public Date getEnd_time() {
        return end_time;
    }

    /**
     * @param end_time the end_time to set
     */
    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    /**
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }

    /**
     * @return the pid
     */
    public long getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(long pid) {
        this.pid = pid;
    }

    /**
     * @return the diagnose_type
     */
    public int getDiagnose_type() {
        return diagnose_type;
    }

    /**
     * @param diagnose_type the diagnose_type to set
     */
    public void setDiagnose_type(int diagnose_type) {
        this.diagnose_type = diagnose_type;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    
    
    
}
