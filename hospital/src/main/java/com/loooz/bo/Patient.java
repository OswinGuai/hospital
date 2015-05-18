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

	private int pid;
    
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
}
