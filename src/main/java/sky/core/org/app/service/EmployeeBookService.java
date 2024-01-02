package sky.core.org.app.service;


public interface EmployeeBookService {

    String welcomeToEmployeeManager();

    void addNewEmployee(String firstName, String lastName);

    void removeEmployee(String firstName, String lastName);

    String findEmployee(String firstName, String lastName);
}
