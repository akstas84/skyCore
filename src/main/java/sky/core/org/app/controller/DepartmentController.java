package sky.core.org.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.core.org.app.entity.Employee;
import sky.core.org.app.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


//    @GetMapping(path = "/departments/max-salary")  ///departments/max-salary?departmentId=5
//    public Employee findEmployeeWithMaximumWageByDepartmentName(@RequestParam int departmentId) {
//        return departmentService.findEmployeeWithMaximumSalary(departmentId).toString();
//    }

//    @GetMapping(path = "/departments/min-salary")  ///departments/min-salary?departmentId=5
//    public Employee findEmployeeWithMinimumWageByDepartmentName(@RequestParam int departmentId) {
//        return departmentService.findEmployeeWithMinimumSalary(departmentId).toString();
//    }

}
