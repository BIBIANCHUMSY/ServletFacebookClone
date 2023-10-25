package services.serviceImplementation;

import entities.User;
import jdbcConnection.DatabaseConnection;
import services.UserServices;

public class UserServiceImpl implements UserServices {

    private DatabaseConnection facebookRepo;

    public UserServiceImpl(DatabaseConnection facebookRepo) {
        this.facebookRepo = facebookRepo;
    }
    @Override
    public String signIn(User user) {
        return facebookRepo.userLogin(user);
    }

    @Override
    public String signUp(User user) {
        return null;
    }

    @Override
    public String signOut(User user) {
        return null;
    }
}
