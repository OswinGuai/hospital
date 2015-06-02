/**
 * 
 */
package com.loooz.constants;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年6月1日 下午3:59:20
 *
 */
public enum ProcedureType {

    FIRST_CHECK(1001, "就诊"),
    DETECTION(1002, "检测"),
    GET_MEDICINE(1003, "取药"),
    RECHECK(1004, "复诊"),
    ROUTINE(1005, "办理手续");
    
    private int typeId;
    
    private String typeName;
    
    private ProcedureType(int typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
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
     * @return the typeId
     */
    public int getTypeId() {
        return typeId;
    }
    /**
     * @param typeId the typeId to set
     */
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    
}
