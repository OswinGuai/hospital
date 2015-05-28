/**
 * 
 */
package com.alipay.executor;

import net.sf.json.JSONObject;

import com.alipay.constants.MenuUrlConfig;
import com.alipay.util.AlipayPageBuildUtil;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月28日 下午3:05:16
 *
 */
public class InAlipayAsyncPageTransferExecutor implements ActionExecutor {

    /** 业务参数 */
    private JSONObject             bizContent;

    public InAlipayAsyncPageTransferExecutor(JSONObject bizContent) {
        this.bizContent = bizContent;
    }

    @Override
    public String execute() {

        //取得发起请求的支付宝账号id
        final String fromUserId = bizContent.getString("FromUserId");
        
        final String actionParam = bizContent.getString("ActionParam");

        String url = MenuUrlConfig.getUrlByMenuId(actionParam, fromUserId);
        
        String syncResponseMsg = AlipayPageBuildUtil.buildPageTransferResponse(fromUserId, url);

        return syncResponseMsg;
    }
}
