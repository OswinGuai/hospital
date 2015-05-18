/**
 * 
 */
package com.loooz.service.impl;

import com.alipay.api.internal.util.StringUtils;
import com.loooz.bo.User;
import com.loooz.dao.UserDao;
import com.loooz.dao.impl.UserDaoImpl;
import com.loooz.exception.UserOperationException;
import com.loooz.service.UserService;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月14日 下午3:27:32
 *
 */
public class UserServiceImpl implements UserService {

	private UserDao dao = UserDaoImpl.getInstance();

	private UserServiceImpl() {
	}
	
	/**
     * 防止多线程情况下，构建单例出现问题（加载类的过程线程安全）
     */
    private static class Container {
        private static UserService service = new UserServiceImpl();
    }
    
    /**
     * 获取实例
     * @return 单例
     */
    public static UserService getInstance() {
        /**
         * 惰性加载UserDao实例，避免不必要的资源占用
         */
        return Container.service;
    }
	
	/* (non-Javadoc)
	 * @see com.loooz.service.UserService#getUserByAid(java.lang.String)
	 */
	@Override
	public User getUserByAid(String aid) {
        return dao.selectByAid(aid);
    }

	/* (non-Javadoc)
	 * @see com.loooz.service.UserService#addFollowUser(com.loooz.bo.User)
	 */
	@Override
	public void addFollowUser(User user) throws UserOperationException {
        if (StringUtils.isEmpty(user.getAid())) {
            throw new UserOperationException("用户支付宝ID不能为空");
        }
        if (dao.selectByAid(user.getAid()) != null) {
            throw new UserOperationException("不能添加已经存在的用户");
        }
        dao.addUser(user);
    }

}
