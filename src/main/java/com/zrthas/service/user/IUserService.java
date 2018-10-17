package com.zrthas.service.user;

import com.zrthas.entity.user.UserEntity;

public interface IUserService {
    /**
     * 判断是否有该用户
     * @param userEntity
     * @return
     */
    Boolean findUserExist(UserEntity userEntity);
}
