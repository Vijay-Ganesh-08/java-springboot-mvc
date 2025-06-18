package org.training.springbootmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.training.springbootmvc.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @RequestMapping("/")
    public String homepage() {
        return "index";
    }

    @GetMapping("getEmployees")
    public String getAliens(Model model) {
        model.addAttribute("employees", employeeRepo.findAll());
        return "showEmployees";
    }

    @GetMapping("getEmployeeById")
    public String getEmployee(@RequestParam Integer eid, Model model) {
        model.addAttribute("employee", employeeRepo.findById(eid));
        return "showEmployee";
    }

    @GetMapping("getEmployeeByFirstName")
    public String getEmployeeByFirstName(@RequestParam String firstName, Model model) {
        model.addAttribute("employee", employeeRepo.findByFirstnameOrderByEid(firstName));
        return "showEmployee";
    }

    @GetMapping("getEmployeeByLastName")
    public String getEmployeeByLastName(@RequestParam String lastName, Model model) {
        model.addAttribute("employee", employeeRepo.find(lastName));
        return "showEmployee";
    }

    @RequestMapping("add")
    public String add(@RequestParam int firstNumber, @RequestParam int secondNumber, Model model) {
        int result = firstNumber + secondNumber;
        model.addAttribute("result", result);

        return "result";
    }

    @RequestMapping("addEmployee")
    public String addEmployee(Employee emp) {

        employeeRepo.save(emp);
        return "result";
    }

    @ModelAttribute
    public void ModelData(Model model) {
        model.addAttribute("name" , "Employees");
    }
}
