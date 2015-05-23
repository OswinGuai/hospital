/**
 * 
 */
package com.loooz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alipay.api.internal.util.StringUtils;
import com.loooz.bo.User;
import com.loooz.constants.ErrorInfo;
import com.loooz.dao.UserDao;
import com.loooz.exception.UserOperationException;
import com.loooz.service.UserService;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月14日 下午3:27:32
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name = "userDao")
	private UserDao dao;

	
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
            throw new UserOperationException(ErrorInfo.ALIPAY_ID_EMPTY);
        }
        if (dao.selectByAid(user.getAid()) != null) {
            throw new UserOperationException(ErrorInfo.CANNOT_ADD_EXISTING_USER);
        }
        dao.addUser(user);
    }

}
