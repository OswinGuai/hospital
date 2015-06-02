/**
 * 
 */
package com.loooz.bo;

import java.io.Serializable;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年6月1日 下午2:21:20
 *
 */
public class DiagnoseRoom implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5426400390767749236L;

    private int roomId;
    
    private String name;
    
    private String location;

    /**
     * @return the roomId
     */
    public int getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(int roomId) {
        this.roomId = roomId;
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
    
    public static DiagnoseRoom getDefaultRoomInfo() {
        DiagnoseRoom room = new DiagnoseRoom();
        room.setName("所选诊室");
        room.setLocation("指定位置");
        return room;
    }
}
