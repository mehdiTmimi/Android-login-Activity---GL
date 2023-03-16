package com.mehditmimi.myapplication.dao;

import com.mehditmimi.myapplication.models.User;

import java.util.List;
import java.util.Vector;

public class UserDaoMemory implements UserDao{
    private List<User> users;

    public UserDaoMemory(){
        users=new Vector<>();
        users.add(new User("mehdi@gmail.com","salut","mehdi"));
        users.add(new User("Sarah@gmail.com","bonjour","sarah"));
    }
    @Override
    public User get(String login) {
        for (User u :users)
            if(u.getLogin().equals(login))
                return u;
        return null;
    }
}
