package com.loooz.dao;

import com.loooz.bo.User;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月14日 下午3:31:55
 *
 */
public interface UserDao {
    
    /**
     * 查询某个AID的用户
     * 
     * @param id
     * @return
     */
    public User selectByAid(String aid);

    /**
     * 添加用户
     * @param user
     */
    public void addUser(User user);
}
