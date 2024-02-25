package sky.core.org.app.service;

import org.springframework.stereotype.Service;
import sky.core.org.app.entity.Employee;


import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Collection<Employee> findEmployeesByDepartmentSortedByNameSurname(int departmentId) {
        return employeeService.findAll().stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .sorted(comparing(Employee::getLastName).thenComparing(Employee::getFirstName))
                .collect(toList());
    }

    @Override
    public Integer amountSalaryByDepartment(int departmentId) {
        return employeeService.findAll().stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .mapToInt(Employee::getSalary)
                .sum();
    }

    @Override
    public Optional<Employee> findMaxSalary(int departmentId) {
        return employeeService.findAll().stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .max(comparingInt(Employee::getSalary));
    }

    @Override
    public Optional<Employee> findMinSalary(int departmentId) {
        return employeeService.findAll().stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .min(comparingInt(Employee::getSalary));
    }

    @Override
    public Map<Integer, List<Employee>> employeesGroupedByDepartment() {
                return employeeService.findAll().stream()
                .sorted(comparing(Employee::getLastName).thenComparing(Employee::getFirstName))
                .collect(groupingBy(Employee::getDepartmentId));
    }

}
