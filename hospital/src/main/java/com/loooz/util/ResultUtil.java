/**
 * 
 */
package com.loooz.util;

import com.loooz.exception.BaseException;
import com.loooz.vo.JsonResult;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月25日 下午4:21:24
 *
 */
public class ResultUtil {

    private static class JsonResultFact extends JsonResult {

        /**
         * 
         */
        private static final long serialVersionUID = 1508250153006893252L;
        
    }
    
    /**
     * 返回的view统一包含status和msg，数据部分用data
     * @param object
     * @return
     */
    public static JsonResult parseToView(Object object) {
        JsonResultFact fact = new JsonResultFact();
        fact.setStatus(0);
        fact.setMsg("success");
        fact.setData(object);
        return fact;
    }
    
    public static JsonResult parseToView(BaseException e) {
        JsonResultFact fact = new JsonResultFact();
        fact.setStatus(e.getErrorCode());
        fact.setMsg(e.getMessage());
        return fact;
    }
}
