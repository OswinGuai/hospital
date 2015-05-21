package com.loooz.dao;

import org.springframework.stereotype.Repository;

import com.loooz.bo.User;

/**
 * 
 * @Description: TODO
 * @author Pei Zhongyi
 * @date 2015年5月8日 下午3:29:48
 */
@Repository 
public interface UserMapper {
    
    public User selectByAid(String aid);
    
    public void addUser(User user);
}