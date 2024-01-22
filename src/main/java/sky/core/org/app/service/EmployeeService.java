package sky.core.org.app.service;


import sky.core.org.app.entity.Employee;

import java.util.Collection;

public interface EmployeeService {

    Collection<Employee> findAll();

    String welcomeToEmployeeManager();

    Employee addNewEmployee(String firstName, String lastName);

    void removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

}
