package Pr8.chainOfResponsibility.handlers;

import Pr8.chainOfResponsibility.AuthUser;
import Pr8.chainOfResponsibility.FakeServer;

/**
 * Обработчик для проверки логина и пароля
 */
public class DataValidation extends Base {
    private final FakeServer server;

    public DataValidation(FakeServer server) {
        this.server = server;
    }

    @Override
    public boolean check(AuthUser user) {
        if (!server.doesExist(user.getLogin())) {
            System.out.println("User with this login wasn't found");
            return false;
        }
        if (!server.isPasswordCorrect(user.getLogin(), user.getPassword())) {
            System.out.println("Password is incorrect");
            return false;
        }
        return checkNext(user);
    }
}

