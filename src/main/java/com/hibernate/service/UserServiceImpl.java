package com.hibernate.service;

import com.hibernate.auth.User;
import com.hibernate.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void create(User user) {
        userDao.create(user);
    }
}
