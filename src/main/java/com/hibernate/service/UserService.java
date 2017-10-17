package com.hibernate.service;

import com.hibernate.auth.User;

public interface UserService {
    public void create(User user);

    public boolean userExists(String username);
}
