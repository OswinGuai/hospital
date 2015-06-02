/**
 * 
 */
package com.loooz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loooz.bo.DiagnoseRoom;
import com.loooz.constants.ProcedureType;
import com.loooz.dao.DiagnoseRoomDao;
import com.loooz.service.DiagnoseRoomService;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年6月1日 下午3:44:57
 *
 */
@Service("diagnoseRoomService")
public class DiagnoseRoomServiceImpl implements DiagnoseRoomService {

    @Resource
    private DiagnoseRoomDao diagnoseRoomDao;
    
    /* (non-Javadoc)
     * @see com.loooz.service.DiagnoseRoomService#getRoomByDirection(int, int)
     */
    @Override
    public DiagnoseRoom getRoomByDirection(int diagnoseTypeId,
            ProcedureType procedureType) {
        return diagnoseRoomDao.selectByDirection(diagnoseTypeId, procedureType.getTypeId());
    }

}
