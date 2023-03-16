package com.mehditmimi.myapplication.business;

import com.mehditmimi.myapplication.models.User;

public interface Services {
    User login(String login, String password);
}
