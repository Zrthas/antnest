package com.zrthas.service.user.impl;

import com.zrthas.dao.user.UserEntityDao;
import com.zrthas.entity.user.UserEntity;
import com.zrthas.entity.user.UserInfoEntity;
import com.zrthas.service.user.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author:
 * @desc:
 * @date:yyyy/mm/dd
 */
@Service("userService")
public class UserService implements IUserService {
    @Resource
    private UserEntityDao userEntityDao;

    @Override
    public Boolean findUserExist(UserEntity userEntity) {
        UserEntity resultEntity = userEntityDao.findUserExist(userEntity);
        return !resultEntity.getUserName().isEmpty();
    }

    @Override
    public Boolean insertNewUser(UserEntity userEntity) {
        Integer iResult = userEntityDao.insertNewUser(userEntity);
        boolean b = iResult == 1 ? true : false;
        return b;
    }

    @Override
    public Boolean insertNewUserInfo(UserInfoEntity userInfoEntity) {
        Integer iResult = userEntityDao.insertNewUserInfo(userInfoEntity);
        boolean b = iResult == 1 ? true : false;
        return b;
    }

}
