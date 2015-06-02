/**
 * 
 */
package com.loooz.service;

import com.loooz.bo.DiagnoseRoom;
import com.loooz.constants.ProcedureType;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年6月1日 下午3:43:50
 *
 */
public interface DiagnoseRoomService {

    public DiagnoseRoom getRoomByDirection(int diagnoseTypeId,
            ProcedureType procedureType);
}
