/**
 * 
 */
package com.loooz.bo;

import java.io.Serializable;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月14日 下午3:16:28
 *
 */
public class PersonBase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5408573367536878048L;
	/*姓名*/
	private String name;
    //身份证号
	private String idcard;
    //手机号
	private String cellphone;
    
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
	 * @return the idcard
	 */
	public String getIdcard() {
		return idcard;
	}
	/**
	 * @param idcard the idcard to set
	 */
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	/**
	 * @return the cellphone
	 */
	public String getCellphone() {
		return cellphone;
	}
	/**
	 * @param cellphone the cellphone to set
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
    
}
