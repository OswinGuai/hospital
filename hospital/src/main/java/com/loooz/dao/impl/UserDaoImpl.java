/**
 * 
 */
package com.loooz.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loooz.bo.User;
import com.loooz.dao.UserDao;
import com.loooz.dao.UserMapper;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月14日 下午3:33:11
 *
 */
@Service("userDao")
public class UserDaoImpl implements UserDao {

	@Resource
	private UserMapper userOperation;
    
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
