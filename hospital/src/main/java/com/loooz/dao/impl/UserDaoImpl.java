/**
 * 
 */
package com.loooz.dao.impl;

import com.loooz.bo.User;
import com.loooz.dao.UserDao;
import com.loooz.dao.UserMapper;
import com.loooz.util.MybatisUtils;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月14日 下午3:33:11
 *
 */
public class UserDaoImpl implements UserDao {

	private static UserMapper userOperation = null;

    /**
     * 隐匿构造函数
     */
    private UserDaoImpl() {
        userOperation = MapperContainer.userOperation;
    }

    /**
     * 实例获取方法
     * 
     * @return 单例
     */
    public static UserDao getInstance() {
        /**
         * 惰性加载UserDao实例，避免不必要的资源占用
         */
        return Container.dao;
    }

    private static class MapperContainer {
        private static UserMapper userOperation = MybatisUtils.getSqlSession()
                .getMapper(UserMapper.class);
    }

    /**
     * 
     * 防止多线程情况下，构建单例出现问题（加载类的过程线程安全）
     */
    private static class Container {
        private static UserDao dao = new UserDaoImpl();
    }
    
	/* (non-Javadoc)
	 * @see com.loooz.dao.UserDao#selectByAid(java.lang.String)
	 */
	@Override
	public User selectByAid(String aid) {
        User user = userOperation.selectByAid(aid);
        return user;
    }

	/* (non-Javadoc)
	 * @see com.loooz.dao.UserDao#addUser(com.loooz.bo.User)
	 */
	@Override
	public void addUser(User user) {
        userOperation.addUser(user);
    }

}
