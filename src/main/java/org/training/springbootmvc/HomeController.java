package org.training.springbootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.training.springbootmvc.model.Employee;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage() {
        return "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam int firstNumber, @RequestParam int secondNumber, Model model) {

//        ModelAndView modelAndView = new ModelAndView("result");
//        modelAndView.setViewName();

        int result = firstNumber + secondNumber;
        model.addAttribute("result", result);

        return "result";
    }

    @RequestMapping("addEmployee")
    public String addEmployee(Employee emp) {

//        Employee emp = new Employee();
//        emp.setId(eid);
//        emp.setFirstName(fName);
//        emp.setlName(lName);
//        model.addAttribute("emp", emp);
        return "result";
    }

    @ModelAttribute
    public void ModelData(Model model) {
        model.addAttribute("name" , "Vijay");
    }
}
