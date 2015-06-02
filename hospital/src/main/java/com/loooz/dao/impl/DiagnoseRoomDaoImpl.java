/**
 * 
 */
package com.loooz.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loooz.bo.DiagnoseRoom;
import com.loooz.dao.DiagnoseRoomDao;
import com.loooz.dao.DiagnoseRoomMapper;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年6月1日 下午3:41:55
 *
 */
@Service("diagnoseRoomDao")
public class DiagnoseRoomDaoImpl implements DiagnoseRoomDao {

    @Resource
    private DiagnoseRoomMapper mapper;
    
    /* (non-Javadoc)
     * @see com.loooz.dao.DiagnoseRoomDao#selectByDirection(int, int)
     */
    @Override
    public DiagnoseRoom selectByDirection(int diagnoseTypeId,
            int procedureTypeId) {
        return mapper.selectByDirection(diagnoseTypeId, procedureTypeId);
    }

}
