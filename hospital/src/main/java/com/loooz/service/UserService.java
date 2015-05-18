/**
 * 
 */
package com.loooz.service;

import com.loooz.bo.User;
import com.loooz.exception.UserOperationException;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月14日 下午3:22:16
 *
 */
public interface UserService {

    public User getUserByAid(String aid);
    
    public void addFollowUser(User user) throws UserOperationException;
}
