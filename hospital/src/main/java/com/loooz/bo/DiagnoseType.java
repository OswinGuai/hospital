/**
 * 
 */
package com.loooz.bo;

import java.io.Serializable;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月30日 下午1:51:32
 *
 */
public class DiagnoseType implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3018361829794307674L;

    private long id;
    
    private String typeName;
    
    private long parentId;

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
     * @return the typeName
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName the typeName to set
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return the parentId
     */
    public long getParentId() {
        return parentId;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(long parentId) {
        this.parentId = parentId;
    }
    
    
}
