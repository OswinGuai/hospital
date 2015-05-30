/**
 * 
 */
package com.loooz.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.loooz.bo.DiagnoseType;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月30日 下午1:56:54
 *
 */
@Repository
public interface DiagnoseTypeMapper {

    public List<DiagnoseType> selectRootTypes();
    
    public List<DiagnoseType> selectSubTypes(int parentId);
}
