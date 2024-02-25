package sky.core.org.app.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import sky.core.org.app.entity.Employee;
import sky.core.org.app.exceptions.EmployeeAlreadyAddedException;
import sky.core.org.app.exceptions.EmployeeNotFoundException;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceImplTest {

    private EmployeeServiceImpl employeeServiceIml;

    private String firstName;
    private String lastName;
    private Employee employee;
    private Employee exEmployee;

    @BeforeEach
    void before(final TestInfo info) {
        this.employeeServiceIml = new EmployeeServiceImpl();
        firstName = "Fedor";
        lastName = "Pomidor";
        employee = new Employee(firstName, lastName);


        final Set<String> testTags = info.getTags();
        if(testTags.stream()
                .filter(tag->tag.equals("skipBeforeEach"))
                .findFirst()
                .isPresent()){
            return;}

        exEmployee = employeeServiceIml.addNewEmployee(firstName, lastName);
    }

    @Test
    void welcomeToEmployeeManager() {
        String expected = "Это главная страница";
        String actual = employeeServiceIml.welcomeToEmployeeManager();
        assertEquals(expected, actual);
    }

    @Test
    void addNewEmployee() {
        assertTrue(exEmployee.equals(employee));
    }

    @Test
    void addExistingEmployee() {
        assertThrows(EmployeeAlreadyAddedException.class, () -> employeeServiceIml.addNewEmployee(firstName, lastName));
    }

    @Test
    void removeEmployee() {
        Map<String, Employee> employees = employeeServiceIml.getEmployees();
        employeeServiceIml.removeEmployee(firstName, lastName);
        assertTrue(employees.size() == 0);
    }

    @Tag("skipBeforeEach")
    @Test
    void removeNonExistingEmployee() {
        Map<String, Employee> employees = employeeServiceIml.getEmployees();
        assertThrows(EmployeeNotFoundException.class, () -> employeeServiceIml.removeEmployee(firstName, lastName));
        assertTrue(employees.size() == 0);
    }

    @Test
    void findEmployee() {
        Employee exEmployee = employeeServiceIml.findEmployee(firstName, lastName);
        assertTrue(exEmployee.equals(employee));
    }

}
