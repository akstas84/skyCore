package sky.core.org.app.service;

import org.springframework.stereotype.Service;
import sky.core.org.app.entity.Employee;
import sky.core.org.app.exceptions.EmployeeAlreadyAddedException;
import sky.core.org.app.exceptions.EmployeeNotFoundException;
import sky.core.org.app.exceptions.EmployeeStorageIsFullException;

import java.util.*;

@Service
public class EmployeeBookServiceImpl implements EmployeeBookService {

    private List<Employee> employeesList;

    EmployeeBookServiceImpl() {
        employeesList = new ArrayList<>() {
            {
                add(new Employee("Vasya", "Vasin"));
                add(new Employee("Kolya", "Kolin"));
                add(new Employee("Vera", "Verina"));
                add(new Employee("Olesya", "Olesina"));
                add(new Employee("Petya", "Petin"));
                add(new Employee("Stas", "St"));
                add(new Employee("Diana", "Di"));
                add(new Employee("Olya", "Ol"));
                add(new Employee("Valera", "Delaay"));
                add(new Employee("Gr", "Gr"));
            }
        };
    }

    @Override
    public String welcomeToEmployeeManager() {
        return "Это главная страница";
    }

    @Override
    public void addNewEmployee(String firstName, String lastName) {
        int limitEmployee = 10;
        if (employeesList.size() >= limitEmployee) {
            throw new EmployeeStorageIsFullException("Количество сотрудников не может превышать 10");
        }
        if (listIsContainsEmployee(firstName, lastName, employeesList)) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже добавлен");
        }
        if (!listIsContainsEmployee(firstName, lastName, employeesList)) {
            employeesList.add(new Employee(firstName, lastName));
            System.out.println("Сотрудник добавлен");
        }
    }

    @Override
    public void removeEmployee(String firstName, String lastName) {
        if (listIsContainsEmployee(firstName, lastName, employeesList)) {
            employeesList.remove(new Employee(firstName, lastName));
        }
        throw new EmployeeNotFoundException("Сотрудник с таким именем не найден");
    }

    @Override
    public String findEmployee(String firstName, String lastName) {
        Boolean b = listIsContainsEmployee(firstName, lastName, employeesList);
        if (listIsContainsEmployee(firstName, lastName, employeesList)) {
            return "Сотрудник с таким именем найден";
        }
        throw new EmployeeNotFoundException("Сотрудник с таким именем не найден");
    }

    private static boolean listIsContainsEmployee(String firstName, String lastName, List<Employee> employeesList) {
        return employeesList.contains(new Employee(firstName, lastName));
    }
}
