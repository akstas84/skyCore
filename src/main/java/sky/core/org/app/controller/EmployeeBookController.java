package sky.core.org.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.core.org.app.service.EmployeeBookServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeBookController {

    private EmployeeBookServiceImpl employeeBookServiceImpl;

    public EmployeeBookController(EmployeeBookServiceImpl employeeBookServiceImpl) {
        this.employeeBookServiceImpl = employeeBookServiceImpl;
    }

    @GetMapping(path = "/add")
    public void addNewEmployee(@RequestParam("fn") String firstName, @RequestParam("ln") String lastName) {
        employeeBookServiceImpl.addNewEmployee(firstName, lastName);
    }

    @GetMapping(path = "/remove")
    public void removeEmployee(@RequestParam("fn") String firstName, @RequestParam("ln") String lastName) {
        employeeBookServiceImpl.removeEmployee(firstName, lastName);
    }

    @GetMapping(path = "/find")
    public void findEmployee(@RequestParam("fn") String firstName, @RequestParam("ln") String lastName) {
        employeeBookServiceImpl.findEmployee(firstName, lastName);
    }

    @GetMapping(path = "/home")
    public String welcomeToEmployeeManager() {
        return employeeBookServiceImpl.welcomeToEmployeeManager();
    }

}
