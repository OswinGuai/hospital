/**
 * 
 */
package com.loooz.dao;

import com.loooz.bo.DiagnoseRoom;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年6月1日 下午3:35:55
 *
 */
public interface DiagnoseRoomDao {

    public DiagnoseRoom selectByDirection(int diagnoseTypeId, int procedureTypeId);
}
