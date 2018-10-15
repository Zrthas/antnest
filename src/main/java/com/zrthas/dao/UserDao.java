package com.zrthas.dao;

import com.zrthas.entity.User;
import com.zrthas.entity.user.UserEntity;

import javax.annotation.Resource;

@Resource
public interface UserDao {
    User findUserById(int id);
    UserEntity findUserExist(UserEntity userEntity);
}
