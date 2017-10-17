package com.hibernate.dao;

import com.hibernate.auth.User;

public interface UserDao {
    public void create(User user);

    public boolean userExists(String username);
}
