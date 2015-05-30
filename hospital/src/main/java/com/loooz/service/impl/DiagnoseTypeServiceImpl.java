/**
 * 
 */
package com.loooz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loooz.bo.DiagnoseType;
import com.loooz.dao.DiagnoseTypeDao;
import com.loooz.service.DiagnoseTypeService;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月30日 下午2:10:23
 *
 */
@Service("diagnoseTypeService")
public class DiagnoseTypeServiceImpl implements DiagnoseTypeService {

    @Resource
    private DiagnoseTypeDao dao;
    
    /* (non-Javadoc)
     * @see com.loooz.service.DiagnoseTypeService#getRootTypes()
     */
    @Override
    public List<DiagnoseType> getRootTypes() {
        return dao.selectRootTypes();
    }

    /* (non-Javadoc)
     * @see com.loooz.service.DiagnoseTypeService#getSubTypes()
     */
    @Override
    public List<DiagnoseType> getSubTypes(int parentId) {
        return dao.selectSubTypes(parentId);
    }

}
