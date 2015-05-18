package com.loooz.dao;

import com.loooz.bo.User;

/**
 * 
 * @Description: TODO
 * @author Pei Zhongyi
 * @date 2015年5月8日 下午3:29:48
 */
public interface UserMapper {
    
    public User selectByUid(int uid);
    
    public User selectByAid(String aid);
    
    public void addUser(User user);
}