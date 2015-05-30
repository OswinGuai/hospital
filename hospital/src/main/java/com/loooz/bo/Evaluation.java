/**
 * 
 */
package com.loooz.bo;

import java.io.Serializable;
import java.sql.Date;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月28日 下午1:57:27
 *
 */
public class Evaluation implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -3073678522700922471L;

    private long id;
    
    private long reportId;
    
    private int grade;
    
    private String commment;
    
    private Date date;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the reportId
     */
    public long getReportId() {
        return reportId;
    }

    /**
     * @param reportId the reportId to set
     */
    public void setReportId(long reportId) {
        this.reportId = reportId;
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return the commment
     */
    public String getCommment() {
        return commment;
    }

    /**
     * @param commment the commment to set
     */
    public void setCommment(String commment) {
        this.commment = commment;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
