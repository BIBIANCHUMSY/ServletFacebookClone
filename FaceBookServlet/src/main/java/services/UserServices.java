package services;

import entities.User;

public interface UserServices {

    String signIn(User user);
    String signUp(User user);
    String signOut(User user);
}
