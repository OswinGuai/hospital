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
    
	private long id;
	
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
}