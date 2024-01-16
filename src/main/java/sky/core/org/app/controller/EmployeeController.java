package sky.core.org.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.core.org.app.service.EmployeeService;
import sky.core.org.app.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeServiceImpl employeeBookService) {
        this.employeeService = employeeBookService;
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
