package sky.core.org.app.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static sky.core.org.app.EmployeeTestConstants.*;


@ExtendWith(MockitoExtension.class)
public class DepartmentServiceImplTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private DepartmentServiceImpl departmentServiceImpl;


    int id;
    int minSalary;
    int maxSalary;

    @BeforeEach
    void before() {
        id = 1;
        minSalary = 100;
        maxSalary = 200;
    }

    @Test
    void findEmployeesByDepartmentSortedByNameSurname() {
        when(employeeService.findAll()).thenReturn(EMPLOYEES);
        // ?
        departmentServiceImpl.findEmployeesByDepartmentSortedByNameSurname(id);
    }

    @Test
    void amountSalaryByDepartment() {
        when(employeeService.findAll()).thenReturn(EMPLOYEES);
        assertEquals(AMOUNT_SALARY, departmentServiceImpl.amountSalaryByDepartment(id));
    }

    @Test
    void findMaxSalary() {
        when(employeeService.findAll()).thenReturn(EMPLOYEES);
        assertEquals(MAX_SALARY_EMPLOYEE, departmentServiceImpl.findMaxSalary(id));
    }

    @Test
    void findMinSalary() {
        when(employeeService.findAll()).thenReturn(EMPLOYEES);
        assertEquals(MIN_SALARY_EMPLOYEE,departmentServiceImpl.findMinSalary(id));
    }

    @Test
    void employeesGroupedByDepartment() {
        when(employeeService.findAll()).thenReturn(EMPLOYEES);
        departmentServiceImpl.employeesGroupedByDepartment();
        //?
    }

}
