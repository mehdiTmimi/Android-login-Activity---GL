package com.mehditmimi.myapplication.dao;

import com.mehditmimi.myapplication.models.User;

import java.util.List;

public interface UserDao {
     User get(String login);
}
