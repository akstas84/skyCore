package sky.core.org.app;

import sky.core.org.app.entity.Employee;

import java.util.Set;

public class EmployeeTestConstants {


    public static final String FIRST_NAME = "Albert";
    public static final String LAST_NAME = "Albertovich";
    public static final String FIRST_NAME2 = "Enstain";
    public static final String LAST_NAME2 = "Enstainovich";

    public static final int SALARY = 300;
    public static final int MIN_SALARY = 200;
    public static final int AMOUNT_SALARY = SALARY + MIN_SALARY;
    public static final int DEPARTMENT_ID = 300;


    public static final Employee MAX_SALARY_EMPLOYEE = new Employee(FIRST_NAME2, LAST_NAME2, DEPARTMENT_ID, SALARY );
    public static final Employee MIN_SALARY_EMPLOYEE = new Employee(FIRST_NAME, LAST_NAME,  DEPARTMENT_ID, MIN_SALARY);
    public static final Set<Employee> EMPLOYEES = Set.of(MIN_SALARY_EMPLOYEE, MAX_SALARY_EMPLOYEE);

}
