/**
 * 
 */
package com.loooz.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loooz.bo.DiagnoseType;
import com.loooz.dao.DiagnoseTypeDao;
import com.loooz.dao.DiagnoseTypeMapper;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月30日 下午2:02:50
 *
 */
@Service("diagnoseTypeDao")
public class DiagnoseTypeDaoImpl implements DiagnoseTypeDao {

    @Resource
    private DiagnoseTypeMapper mapper;
    
    /* (non-Javadoc)
     * @see com.loooz.dao.DiagnoseTypeDao#getRootTypes()
     */
    @Override
    public List<DiagnoseType> selectRootTypes() {
        return mapper.selectRootTypes();
    }

    /* (non-Javadoc)
     * @see com.loooz.dao.DiagnoseTypeDao#getSubTypes()
     */
    @Override
    public List<DiagnoseType> selectSubTypes(int parentId) {
        return mapper.selectSubTypes(parentId);
    }

}
