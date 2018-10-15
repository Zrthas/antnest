package com.zrthas.dao.user;

import com.zrthas.entity.user.UserEntity;

import javax.annotation.Resource;

@Resource
public interface UserEntityDao {
    /**
     * 判断用户是否存在
     * @param userEntity
     * @return
     */
    UserEntity findUserExist(UserEntity userEntity);

    /**
     * 插入新用户基本信息
     * @param userEntity
     */
    int insertNewUser(UserEntity userEntity);
}
