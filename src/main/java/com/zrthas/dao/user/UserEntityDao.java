package com.zrthas.dao.user;

import com.zrthas.entity.user.UserEntity;
import com.zrthas.entity.user.UserInfoEntity;

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

    /**
     * 插入用户详细信息
     * @param u
     * @return
     */
    int insertUserInfo(UserInfoEntity userInfoEntity);
}
