package com.zrthas.dao;

import com.zrthas.entity.User;

public interface UserDao {
    User findUserById(int id);
}
