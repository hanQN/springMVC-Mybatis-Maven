package com.han.ssm.dao;

import com.han.ssm.model.User;

/**
 * Created by 123 on 2018/3/12.
 */
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}