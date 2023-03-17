package com.mehditmimi.myapplication.models;

import java.io.Serializable;

public class User implements Serializable {
    private String login;
    private String pwd;
    private String name;

    public User() {
    }

    public User(String login, String pwd, String name) {
        this.login = login;
        this.pwd = pwd;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
