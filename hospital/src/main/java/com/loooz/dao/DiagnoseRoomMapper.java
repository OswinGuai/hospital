/**
 * 
 */
package com.loooz.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.loooz.bo.DiagnoseRoom;

/**
 * @description
 * @author Pei Zhongyi
 * @date 2015年6月1日 下午3:39:41
 *
 */
@Repository
public interface DiagnoseRoomMapper {

    public DiagnoseRoom selectByDirection(@Param("diagnoseTypeId") int diagnoseTypeId,
            @Param("procedureTypeId") int procedureTypeId);
}
