/**
 * 
 */
package com.loooz.service;

import java.util.List;

import com.loooz.bo.DiagnoseType;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月30日 下午1:53:52
 *
 */
public interface DiagnoseTypeService {

    public List<DiagnoseType> getRootTypes();
    
    public List<DiagnoseType> getSubTypes(int parentId);
}
