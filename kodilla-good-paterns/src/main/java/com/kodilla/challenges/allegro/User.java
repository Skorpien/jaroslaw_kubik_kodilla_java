package com.kodilla.challenges.allegro;

public class User {
    private String userName;
    private String userSurname;

    public User (String userName, String userSurname) {
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public String getUserName () {
        return userName;
    }

    public String getUserSurname () {
        return userSurname;
    }
}
