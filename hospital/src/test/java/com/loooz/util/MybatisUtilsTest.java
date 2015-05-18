package com.loooz.util;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import com.loooz.bo.User;
import com.loooz.dao.UserMapper;

/**
 * 
 * @Description: TODO
 * @author Pei Zhongyi
 * @date 2015年5月8日 下午3:24:49
 */
public class MybatisUtilsTest {
    
    @Test
    public void getSqlSessionTest() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper userOperation=session.getMapper(UserMapper.class);
        User user = userOperation.selectByUid(100);
        System.out.println(user.getAid());
        Assert.assertEquals("test_aid_1", user.getAid());
    }
}