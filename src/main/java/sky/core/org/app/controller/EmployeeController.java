package sky.core.org.app.controller;

import org.springframework.web.bind.annotation.*;
import sky.core.org.app.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public void addNewEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        employeeService.addNewEmployee(firstName, lastName);
    }

    @GetMapping(path = "/remove")
    public void removeEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        employeeService.removeEmployee(firstName, lastName);
    }

    @GetMapping(path = "/find")
    public void findEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        employeeService.findEmployee(firstName, lastName);
    }

    @GetMapping(path = "/home")
    public String welcomeToEmployeeManager() {
        return employeeService.welcomeToEmployeeManager();
    }

}
