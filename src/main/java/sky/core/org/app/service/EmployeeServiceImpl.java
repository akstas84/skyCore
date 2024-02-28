package sky.core.org.app.service;

import org.springframework.stereotype.Service;
import sky.core.org.app.entity.Employee;
import sky.core.org.app.exceptions.EmployeeAlreadyAddedException;
import sky.core.org.app.exceptions.EmployeeNotFoundException;
import sky.core.org.app.exceptions.EmployeeStorageIsFullException;


import java.util.*;

import static org.springframework.util.StringUtils.capitalize;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Map<String, Employee> employees;

    public EmployeeServiceImpl() {
        employees = new HashMap<>();
    }

    @Override
    public Collection<Employee> findAll(){
        return Collections.unmodifiableCollection(employees.values());
    }

    @Override
    public String welcomeToEmployeeManager() {
        return "Это главная страница";
    }

    @Override
    public Employee addNewEmployee(String firstName, String lastName) {
        capitalize(firstName);
        capitalize(lastName);
        Employee employee = new Employee(firstName, lastName);
        int limitEmployee = 10;
        if (employees.size() >= limitEmployee) {
            throw new EmployeeStorageIsFullException("Количество сотрудников не может превышать 10");
        }
        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже добавлен");
        } else {
            employees.put(employee.getFullName(), employee);
            System.out.println("Сотрудник с именем " + employee.getFullName() + "  добавлен");
        }
        return new Employee(firstName, lastName);
    }

    @Override
    public void removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            employees.remove(employee.getFullName());
            System.out.println("Сотрудник с именем " + employee.getFullName() + " удалён");
        } else {
            throw new EmployeeNotFoundException("Сотрудник с таким именем не найден");
        }
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            System.out.println("Сотрудник с именем " + employee.getFullName() + " уже есть в справочнике");
            return employees.get(employee.getFullName());
        } else {
            throw new EmployeeNotFoundException("Сотрудник с таким именем не найден");
        }
    }

    public Map<String, Employee> getEmployees() {
        return employees;
    }

}
