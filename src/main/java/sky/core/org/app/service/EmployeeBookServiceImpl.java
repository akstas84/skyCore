package sky.core.org.app.service;

import org.springframework.stereotype.Service;
import sky.core.org.app.entity.Employee;
import sky.core.org.app.exceptions.EmployeeAlreadyAddedException;
import sky.core.org.app.exceptions.EmployeeNotFoundException;
import sky.core.org.app.exceptions.EmployeeStorageIsFullException;

@Service
public class EmployeeBookServiceImpl implements EmployeeBookService {

    private Employee[] employeesArr = new Employee[10];

    EmployeeBookServiceImpl() {
        employeesArr[0] = new Employee("Vasya", "Vasin");
        employeesArr[1] = new Employee("Kolya", "Kolin");
        employeesArr[2] = new Employee("Vera", "Verina");
        employeesArr[3] = new Employee("Olesya", "Olesina");
        employeesArr[4] = new Employee("Petya", "Petin");
        employeesArr[5] = new Employee("Stas", "St");
        employeesArr[6] = new Employee("Diana", "Di");
        employeesArr[7] = new Employee("Olya", "Ol");
        employeesArr[8] = new Employee("Valera", "Delaay");
        employeesArr[9] = new Employee("Grisha", "Gr");
    }

    @Override
    public String welcomeToEmployeeManager() {
        return "Это главная страница";
    }

    @Override
    public Employee addNewEmployee(String firstName, String lastName) {
        Employee addedEmployee = null;
        int limitEmployee = 10;
        for (Employee employee : employeesArr) {
            if (employee == null) {
                if (employeesArr.length >= limitEmployee) {
                    throw new EmployeeStorageIsFullException("Количество сотрудников не может превышать 10");
                }
                if (employee.getFirstName() == firstName && employee.getLastName() == lastName) {
                    throw new EmployeeAlreadyAddedException("Сотрудник уже добавлен");
                }
                if (employee.getFirstName() != firstName && employee.getLastName() != lastName) {
                    addedEmployee = new Employee(firstName, lastName);
                    System.out.println("Сотрудник добавлен");
                    break;
                }
            }
        }
        return addedEmployee;
    }

    @Override
    public void removeEmployee(String firstName, String lastName) {
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i] != null && employeesArr[i].getFirstName() == firstName && employeesArr[i].getLastName() == lastName) {
                employeesArr[i] = null;
                break;
            }
        }
        throw new EmployeeNotFoundException("Сотрудник с таким именем не найден");
    }

    @Override
    public void findEmployee(String firstName, String lastName) {
        for (Employee employee : employeesArr) {
            if (employee != null && employee.getFirstName() == firstName && employee.getLastName() == lastName) {
                System.out.println(employee);
            }
        }
        throw new EmployeeNotFoundException("Сотрудник с таким именем не найден");
    }
}
