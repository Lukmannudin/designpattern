package com.lukmannudin;

public class Authenticator {
    public User login(String userId, String password){
        return new User("login normal","");
    }

    public User gmailLogin(String userId, String password){
        return new User("login gmail","");
    }

    public User twoFactor(User user, long password){
        return new User("login twoFactor","");
    }

}
