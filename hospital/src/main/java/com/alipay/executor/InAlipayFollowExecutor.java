/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.alipay.executor;

import net.sf.json.JSONObject;

import com.alipay.util.AlipayMsgBuildUtil;
import com.loooz.bo.User;
import com.loooz.exception.UserOperationException;
import com.loooz.service.UserService;
import com.loooz.service.impl.UserServiceImpl;

/**
 * 关注服务窗执行器
 * 
 * @author baoxing.gbx
 * @version $Id: InAlipayFollowExecutor.java, v 0.1 Jul 24, 2014 4:29:04 PM baoxing.gbx Exp $
 */
public class InAlipayFollowExecutor implements ActionExecutor {

    /** 业务参数 */
    private JSONObject bizContent;

    /**
     * userService
     */
    private UserService userService = UserServiceImpl.getInstance();
    
    public InAlipayFollowExecutor(JSONObject bizContent) {
        this.bizContent = bizContent;
    }

    public InAlipayFollowExecutor() {
        super();
    }

    @Override
    public String execute() {

        //TODO 根据支付宝请求参数，可以将支付宝账户UID-服务窗ID关系持久化，用于后续开发者自己的其他操作
        // 这里只是个样例程序，所以这步省略。
        // 直接构造简单响应结果返回
        final String fromUserId = bizContent.getString("FromUserId");

        User user = new User();
        user.setAid(fromUserId);
        try {
            userService.addFollowUser(user);
        } catch (UserOperationException e) {
            e.printStackTrace();
            /**
             * 添加用户失败，则忽略这次添加
             */
        }
        
        return AlipayMsgBuildUtil.buildBaseAckMsg(fromUserId);
    }
}
