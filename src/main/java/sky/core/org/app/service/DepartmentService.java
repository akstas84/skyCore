package sky.core.org.app.service;

import sky.core.org.app.entity.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Employee findEmployeeWithMaxSalary(int departmentId);

    Employee findEmployeeWithMinSalary(int departmentId);

    Collection<Employee> findEmployeesByDepartmentSortedByNameSurname(int departmentId);

    Map<Integer, List<Employee>> findEmployeesByDepartmentSortedByNameSurname();

}
