package sky.core.org.app.service;

import org.springframework.stereotype.Service;
import sky.core.org.app.entity.Employee;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    //    1. Возвращать сотрудника с максимальной зарплатой на основе номера отдела, который приходит в запрос из браузера. /departments/max-salary?departmentId=5
//    @Override
    public Employee findEmployeeWithMaximumSalary(int departmentId) {
        return employeeService.returnValues().findAll

    }



    //    2.  Возвращать сотрудника с минимальной зарплатой на основе номера отдела.  /departments/min-salary?departmentId=5
//    @Override
//    public Employee findEmployeeWithMinimumSalary(int departmentId) {
//
//    }


// 3.   Возвращать всех сотрудников по отделу. /departments/all?departmentId=5
// 4.   Возвращать всех сотрудников с разделением по отделам. /departments/all
}
