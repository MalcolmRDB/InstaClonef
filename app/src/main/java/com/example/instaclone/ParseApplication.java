package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("buTaAkPTpebTj8Zcq1JvFAgzqkMyil34vSJW4OeZ")
                .clientKey("LoKn0xrqRgWuFG9UqDaYDfUnKYy0CtO7CIBJNpE0")
                .server("https://parseapi.back4app.com")
                .build());
    }
}
