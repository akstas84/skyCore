package sky.core.org.app.service;


import sky.core.org.app.entity.Employee;

public interface EmployeeBookService {

    String welcomeToEmployeeManager();

    void addNewEmployee(String firstName, String lastName);

    void removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);
}
