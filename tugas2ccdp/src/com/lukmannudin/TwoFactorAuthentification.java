package com.lukmannudin;

import java.net.MalformedURLException;
import java.net.URL;

public class TwoFactorAuthentification {
    private Authenticator authenticator = new Authenticator();

    final URL dashboard = new URL("http://dashboard");
    final URL loginPage = new URL("http://login");

    private User user;
    private long password;

    public TwoFactorAuthentification(User user, long password) throws MalformedURLException {
        this.user = user;
        this.password = password;
    }

    void start() {
        URL target;
        try {
            authenticator.twoFactor(user, password);
            target = dashboard;
        } catch (Exception e) {
            target = loginPage;
        }
        Dispatcher.redirect(target);
    }
}
