package sky.core.org.app.entity;

import java.util.Objects;

public class Employee {

    private final String firstName;
    private final String lastName;
    private int departmentId;
    private int employeeSalary;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, int departmentId, int employeeSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentId = departmentId;
        this.employeeSalary = employeeSalary;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getSalary() {
        return employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
