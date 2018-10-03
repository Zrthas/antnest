package com.zrthas.service.UserService.impl;

import com.zrthas.dao.UserDao;
import com.zrthas.entity.User;
import com.zrthas.service.UserService.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserService implements IUserService{

    @Resource
    private UserDao userDao;

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
}
