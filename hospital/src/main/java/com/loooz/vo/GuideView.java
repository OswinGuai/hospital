/**
 * 
 */
package com.loooz.vo;

import java.io.Serializable;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年6月1日 下午1:46:57
 *
 */
public class GuideView implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -236045521199068912L;

    private String name;
    
    private String roomName;
    
    private String location;
    
    private String procedureName;
    
    /**
     * @return the roomName
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * @param roomName the roomName to set
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the procedureName
     */
    public String getProcedureName() {
        return procedureName;
    }

    /**
     * @param procedureName the procedureName to set
     */
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }
    
    
}
