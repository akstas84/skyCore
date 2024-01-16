package sky.core.org.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.core.org.app.entity.Employee;
import sky.core.org.app.service.DepartmentService;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


    @GetMapping(path = "/max-salary")
    public Employee findEmployeeWithMaximumWageByDepartmentName(@RequestParam int departmentId) {
        return departmentService.findEmployeeWithMaxSalary(departmentId);
    }

    @GetMapping(path = "/min-salary")
    public Employee findEmployeeWithMinSalary(@RequestParam int departmentId) {
        return departmentService.findEmployeeWithMinSalary(departmentId);
    }

    @GetMapping(path = "/all")
    public Collection<Employee> findEmployees(@RequestParam int departmentId) {
        return departmentService.findEmployeesByDepartmentSortedByNameSurname(departmentId);
    }

    @GetMapping(path = "/all")
    public Map<Integer, List<Employee>> findEmployees() {
        return departmentService.findEmployeesByDepartmentSortedByNameSurname();
    }
}
