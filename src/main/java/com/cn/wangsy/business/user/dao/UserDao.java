package com.cn.wangsy.business.user.dao;

import com.cn.wangsy.business.user.pojo.User;


public interface UserDao {
    public int deleteByPrimaryKey(Integer id);

    public int insert(User record);

    public int insertSelective(User record);

    public User selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(User record);

    public int updateByPrimaryKey(User record);
}
