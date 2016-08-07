package com.bdjobs.logintest;

/**
 * Created by Rubayet on 07-Aug-16.
 */
public class UserProfile {
    String name,picUrl,userName;

    public UserProfile(String name, String picUrl, String userName) {
        this.name = name;
        this.picUrl = picUrl;
        this.userName = userName;
    }

    public UserProfile() {

    }

    public UserProfile(String userName, String name) {
        this.userName = userName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
