package com.hibernate.dao;


import com.hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
public class UserDaoImpl  {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void create(User user) {
        Session session = sessionFactory.getCurrentSession();
        Query queryUser = session.createQuery("insert into users (username, password, email, enabled) values (:username, :password, :email, :enabled)");
        queryUser.setParameter("username", user.getUsername());
        queryUser.setParameter("password", user.getPassword());
        queryUser.setParameter("email", user.getEmail());
        queryUser.setParameter("enabled", user.isEnabled());
        queryUser.executeUpdate();
        Query queryAuthority = session.createQuery("insert into authorities (username, authority) values (:username, :authority)");
        queryAuthority.setParameter("username", user.getUsername());
        queryAuthority.setParameter("authority", user.getAuthority());
    }

}
