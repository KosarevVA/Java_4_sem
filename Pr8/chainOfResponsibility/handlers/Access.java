package Pr8.chainOfResponsibility.handlers;

import Pr8.chainOfResponsibility.AuthUser;

/**
 * Обработчик для проверки доступа пользователя к системе
 */
public class Access extends Base {
    @Override
    public boolean check(AuthUser user) {
        boolean allowed = user.isAllowed();
        if (!allowed) {
            System.out.println("Access is denied");
            return false;
        }
        return checkNext(user);
    }
}