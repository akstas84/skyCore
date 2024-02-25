package sky.core.org.app.service;

import sky.core.org.app.entity.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DepartmentService {

    Collection<Employee> findEmployeesByDepartmentSortedByNameSurname(int departmentId);

    Integer amountSalaryByDepartment(int departmentId);


    Optional<Employee> findMaxSalary(int departmentId);



    Optional<Employee> findMinSalary(int departmentId);

    Map<Integer, List<Employee>> employeesGroupedByDepartment();

}

