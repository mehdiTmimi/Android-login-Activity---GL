package com.mehditmimi.myapplication;

import android.app.Application;

import com.mehditmimi.myapplication.business.DefaultServices;
import com.mehditmimi.myapplication.business.Services;
import com.mehditmimi.myapplication.dao.UserDaoMemory;

public class MyContext extends Application {

    private Services services;
    @Override
    public void onCreate() {
        super.onCreate();
        services=new DefaultServices(new UserDaoMemory());
    }

    public Services getServices() {
        return services;
    }
}
