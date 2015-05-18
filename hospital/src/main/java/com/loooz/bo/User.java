package com.loooz.bo;

/**
 * 
 * @Description: TODO
 * @author Pei Zhongyi
 * @date 2015年5月8日 上午11:43:20
 */
public class User extends PersonBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5559766321608124602L;
	
	private String aid;
    
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