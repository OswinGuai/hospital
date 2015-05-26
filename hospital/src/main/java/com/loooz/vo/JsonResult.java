/**
 * 
 */
package com.loooz.vo;

import java.io.Serializable;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月25日 下午4:17:00
 *
 */
public abstract class JsonResult implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1578927459422099613L;
    
    private int status;
    
    private String msg;
    
    
    
    /**
     * 数据部分用data
     */
    private Object data;
   
    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }
}
