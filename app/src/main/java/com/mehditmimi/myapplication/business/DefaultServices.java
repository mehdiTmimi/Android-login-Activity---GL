package com.mehditmimi.myapplication.business;

import com.mehditmimi.myapplication.dao.UserDao;
import com.mehditmimi.myapplication.dao.UserDaoMemory;
import com.mehditmimi.myapplication.models.User;

public class DefaultServices implements Services{
    private UserDao userDao;
    public DefaultServices(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public User login(String login, String password) {
        User user=userDao.get(login);
        if(user==null)
            return null;

        if(user.getPwd().equals(password))
            return user;

        return null;
    }
}
