package com.lukmannudin;

public class UserRemote extends RequestResponse {
    private Authenticator authenticator = new Authenticator();
    RequestResponse requestResponse = new RequestResponse();
    private User user;

    public RequestResponse login(String userId, String password) {
        try {
            user = authenticator.login(userId, password);
        } catch (Exception e) {
            requestResponse.setSuccessful(false);
        }
        return requestResponse;
    }

    public RequestResponse gmailLogin(String userId, String password) {
        try {
            user = authenticator.gmailLogin(userId, password);
        } catch (Exception gmailException) {
            requestResponse.setSuccessful(false);
        }
        return requestResponse;
    }

    public User getUserRemote() {
        return user;
    }
}

