package sky.core.org.app.service;

import org.springframework.stereotype.Service;
import sky.core.org.app.entity.Employee;
import sky.core.org.app.exceptions.EmployeeAlreadyAddedException;
import sky.core.org.app.exceptions.EmployeeNotFoundException;
import sky.core.org.app.exceptions.EmployeeStorageIsFullException;

import java.util.*;

@Service
public class EmployeeBookServiceImpl implements EmployeeBookService {

    private Map<String, Employee> employeesMap;

    EmployeeBookServiceImpl() {
        employeesMap = new HashMap<>();
    }

    @Override
    public String welcomeToEmployeeManager() {
        return "Это главная страница";
    }

    @Override
    public Employee addNewEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        int limitEmployee = 10;
        if (employeesMap.size() >= limitEmployee) {
            throw new EmployeeStorageIsFullException("Количество сотрудников не может превышать 10");
        }
        if (employeesMap.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже добавлен");
        }
        else {
            employeesMap.put(employee.getFullName(), employee);
            System.out.println("Сотрудникс именем " + employee.getFullName() + "  добавлен");
        }
        return new Employee(firstName, lastName);
    }

    @Override
    public void removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeesMap.containsKey(employee.getFullName())) {
            employeesMap.remove(employee.getFullName());
            System.out.println("Сотрудник с именем " + employee.getFullName() + " удалён");
        }
        else {
            throw new EmployeeNotFoundException("Сотрудник с таким именем не найден");
        }
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeesMap.containsKey(employee.getFullName())) {
            System.out.println("Сотрудник с именем " + employee.getFullName() + " уже есть в справочнике");
            return employeesMap.get(employee.getFullName());
        }
        else {
            throw new EmployeeNotFoundException("Сотрудник с таким именем не найден");
        }
    }
}
