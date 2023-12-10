package sky.core.org.app;

public class Credentials {

    public static void checkCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
//        throw WrongPasswordException
        if (!stringCorrect(login)) {
            throw new WrongLoginException("Логин указан не верно!");
        }

        if (stringCorrect(password) && password.equals(confirmPassword)){
            System.out.println("Логин и пароль указаны корректно");
        } else  {
            throw new WrongPasswordException("Пароль указан не верно");
        }
    }

    private static boolean stringCorrect(String checkString) {
        if (checkString == null
                || checkString.isBlank()
                || checkString.length() > 20) {
            return false;
        }
        return checkString.matches("[a-zA-Z0-9_]*");
    }
}
