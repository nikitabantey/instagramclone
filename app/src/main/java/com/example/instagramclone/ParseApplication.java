package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate(){
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PxvvQBGKY4fvn9P7Qb67dtpUB51BrrrWRHq7RUU5")
                .clientKey("WyrZRtHleJlo9n777QmBTkAvbRPSEpy8KSOF0478")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
