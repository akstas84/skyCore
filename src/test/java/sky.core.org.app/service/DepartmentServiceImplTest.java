package sky.core.org.app.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sky.core.org.app.entity.Employee;

import java.util.Collection;

import static java.awt.geom.Path2D.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static sky.core.org.app.EmployeeTestConstants.*;


@ExtendWith(MockitoExtension.class)
public class DepartmentServiceImplTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private DepartmentServiceImpl departmentServiceImpl;


    @Test
    void findEmployeesByDepartmentSortedByNameSurname() {
        when(employeeService.findAll()).thenReturn(EMPLOYEES);
        // ?
        departmentServiceImpl.findEmployeesByDepartmentSortedByNameSurname(DEPARTMENT_ID);
    }

    @Test
    void amountSalaryByDepartment() {
        when(employeeService.findAll()).thenReturn(EMPLOYEES);
        assertEquals(AMOUNT_SALARY, departmentServiceImpl.amountSalaryByDepartment(DEPARTMENT_ID));
    }

    @Test
    void findMaxSalary() {
        when(employeeService.findAll()).thenReturn(EMPLOYEES);
        assertEquals(MAX_SALARY_EMPLOYEE, departmentServiceImpl.findMaxSalary(DEPARTMENT_ID).orElseThrow());
    }

    @Test
    void findMinSalary() {
        when(employeeService.findAll()).thenReturn(EMPLOYEES);
        assertEquals(MIN_SALARY_EMPLOYEE,departmentServiceImpl.findMinSalary(DEPARTMENT_ID).orElseThrow());
    }

    @Test
    void employeesGroupedByDepartment() {
        when(employeeService.findAll()).thenReturn(EMPLOYEES);
        departmentServiceImpl.employeesGroupedByDepartment();
        //?
    }

}
