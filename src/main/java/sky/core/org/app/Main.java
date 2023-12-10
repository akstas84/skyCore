package sky.core.org.app;

public class Main {
    public static void main(String[] args) {
        try {
            Credentials.checkCredentials("admin", "admin", "admin");
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println("валидация аутентификационных данных была не успешна");
            e.printStackTrace();
        } finally {
            System.out.println("блок finally отработал успешно");
        }
    }

    public static void signUp(String login, String password, String confirmPassword){

    }
}
