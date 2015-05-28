/**
 * 
 */
package com.alipay.util;

import java.util.Calendar;

import com.alipay.constants.AlipayServiceEnvConstants;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月28日 下午3:09:01
 *
 */
public class AlipayPageBuildUtil {

    /**
     * 构造基础的响应消息
     * 
     * @return
     */
    public static String buildPageTransferResponse(String fromUserId, String url) {
        StringBuilder sb = new StringBuilder();
        sb.append("<XML>");
        sb.append("<ToUserId><![CDATA[" + fromUserId + "]]></ToUserId>");
        sb.append("<AppId><![CDATA[" + AlipayServiceEnvConstants.APP_ID + "]]></AppId>");
        sb.append("<CreateTime>" + Calendar.getInstance().getTimeInMillis() + "</CreateTime>");
        sb.append("<MsgType><![CDATA[image-text]]></MsgType>");
        sb.append("<ShowType ><![CDATA[open_direct]]></ShowType>");
        sb.append("<ArticleCount>1</ArticleCount>");
        sb.append("<Articles>");
        sb.append("<Item>");
        sb.append("<Title><![CDATA[NO_SENSE]]></Title>");
        sb.append("<Desc><![CDATA[NO_SENSE]]></Desc>");
        sb.append("<ImageUrl><![CDATA[http://alipay.com/ima/2013.jpg]]></ImageUrl>");
        sb.append("<Url><![CDATA[" + url + "]]></Url>");
        sb.append("</Item>");
        sb.append("</Articles>");
        sb.append("<Push><![CDATA[false]]></Push>");
        sb.append("</XML>");
        return sb.toString();
    }
}
