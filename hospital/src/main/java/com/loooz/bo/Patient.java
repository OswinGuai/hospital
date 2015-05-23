/**
 * 
 */
package com.loooz.bo;


/**
 * 
 * @author Pei Zhongyi
 * @date 2015年5月14日 上午11:43:32
 *
 */
public class Patient extends PersonBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8067493303828414682L;

	private long pid;
	
	private String aid;
    
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
	 * @return the aid
	 */
	public String getAid() {
		return aid;
	}
	/**
	 * @param aid the aid to set
	 */
	public void setAid(String aid) {
		this.aid = aid;
	}
}
