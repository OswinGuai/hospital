package com.loooz.constants;

public enum DiagnoseState {
    
    REGISTRATION(3000,"挂号成功"),
    DIAGNOSE_ING(3001,"出诊"),
    DIAGNOSE_DONE(3002,"诊断完");
    
    private int state;
    private String msg;
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
    
    private DiagnoseState(int state, String msg) {
        this.state = state;
        this.msg = msg;
    }
    
}
