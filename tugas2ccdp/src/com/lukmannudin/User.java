package com.lukmannudin;

public class User {
    private String username;
    private String passwrd;

    public User() {
    }

    public User(String username, String passwrd) {
        this.username = username;
        this.passwrd = passwrd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
