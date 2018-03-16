package com.han.ssm.service.impl;

import com.han.ssm.dao.UserDao;
import com.han.ssm.model.User;
import com.han.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 123 on 2018/3/12.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userdao;

    public User getUserByID(int id){
        return  userdao.selectByPrimaryKey(id);
    }
}
