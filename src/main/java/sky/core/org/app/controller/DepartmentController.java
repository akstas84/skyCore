package sky.core.org.app.controller;

import org.springframework.web.bind.annotation.*;
import sky.core.org.app.entity.Employee;
import sky.core.org.app.service.DepartmentService;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    // department/{id}/employees — возвращает список сотрудников по департаменту
    @GetMapping(path = "{id}/employees")
    public Collection<Employee> findEmployeesByDepartment(@PathVariable int id) {
        return departmentService.findEmployeesByDepartmentSortedByNameSurname(id);
    }

    // department/{id}/salary/sum — возвращает сумму зарплат по департаменту.
    @GetMapping(path = "{id}/salary/sum")
    public Integer amountSalaryByDepartment(@PathVariable int id) {
        return departmentService.amountSalaryByDepartment(id);
    }

    //department/{id}/salary/max — возвращает максимальную зарплату по департаменту.
    @GetMapping(path = "{id}/salary/max")
    public Optional<Employee> findMaximumSalaryByDepartmentName(@PathVariable int id) {
        return departmentService.findMaxSalary(id);
    }

    // department/{id}/salary/min — возвращает минимальную зарплату по департаменту.
    @GetMapping(path = "{id}/salary/min")
    public Optional<Employee> findEmployeeWithMinSalary(@PathVariable int id) {
        return departmentService.findMinSalary(id);
    }

    // department/employees — возвращает сотрудников, сгруппированных по отделам
    // в виде Map<Integer,List<Employees>>, где ключ — это номер отдела, а значение — список сотрудников данного отдела.
        @GetMapping(path = "/employees")
        public Map<Integer, List<Employee>> employeesGroupedByDepartment() {
            return departmentService.employeesGroupedByDepartment();
        }

}

