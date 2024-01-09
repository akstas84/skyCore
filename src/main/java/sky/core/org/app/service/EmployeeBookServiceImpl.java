package sky.core.org.app.service;

import org.springframework.stereotype.Service;
import sky.core.org.app.entity.Employee;
import sky.core.org.app.exceptions.EmployeeAlreadyAddedException;
import sky.core.org.app.exceptions.EmployeeNotFoundException;
import sky.core.org.app.exceptions.EmployeeStorageIsFullException;

import java.util.*;

import static sky.core.org.app.controller.EmployeeBookController.returnEmployee;

@Service
public class EmployeeBookServiceImpl implements EmployeeBookService {

    private Map<String, Employee> employeesMap;

    EmployeeBookServiceImpl() {
        employeesMap = new HashMap<>();
        employeesMap.put("1", new Employee("St", "St"));
        employeesMap.put("2", new Employee("Kolya", "Kolin"));
        employeesMap.put("3", new Employee("Vera", "Verina"));
        employeesMap.put("4", new Employee("Olesya", "Olesina"));
        employeesMap.put("5", new Employee("Petya", "Petin"));
        employeesMap.put("6", new Employee("Stas", "St"));
        employeesMap.put("7", new Employee("Diana", "Di"));
        employeesMap.put("8", new Employee("Olya", "Ol"));
        employeesMap.put("9", new Employee("Valera", "Delaay"));
        employeesMap.put("10", new Employee("Gr", "Gr"));
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
        if (!employeesMap.containsKey(employee.getFullName())) {
            employeesMap.put(employee.getFullName(), employee);
            System.out.println("Сотрудник добавлен");
        }
        return returnEmployee(firstName, lastName);
    }

    @Override
    public void removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeesMap.containsKey(employee.getFullName())) {
            employeesMap.remove(employee.getFullName());
        }
        throw new EmployeeNotFoundException("Сотрудник с таким именем не найден");
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeesMap.containsKey(employee.getFullName())) {
            return employeesMap.get(employee.getFullName());
        }
        throw new EmployeeNotFoundException("Сотрудник с таким именем не найден");
    }

    private static boolean listIsContainsEmployee(String firstName, String lastName, Map<Integer, Employee> employeesMap) {
        return employeesMap.containsValue(new Employee(firstName, lastName));
    }
}
