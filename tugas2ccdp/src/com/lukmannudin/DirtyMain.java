package com.lukmannudin;

import java.net.MalformedURLException;
import java.net.URL;

public class DirtyMain {
    public static void main(String[] args) throws MalformedURLException {
        final URL loginPage = new URL("http://login");

        final String userId = "userid";
        final String password = "password";
        final long twoFactorPwd = 12;

        User user = new User();

        UserRemote userRemote = new UserRemote();
        RequestResponse requestLoginUser = userRemote.login(userId, password);
        RequestResponse requestLoginGmailUser = userRemote.gmailLogin(userId, password);

        if (requestLoginUser.isSuccessful() || requestLoginGmailUser.isSuccessful()) {
            user = userRemote.getUserRemote();
        } else {
            Dispatcher.redirect(loginPage);
        }

        TwoFactorAuthentification twoFactor = new TwoFactorAuthentification(user, twoFactorPwd);
        twoFactor.start();
    }
}
