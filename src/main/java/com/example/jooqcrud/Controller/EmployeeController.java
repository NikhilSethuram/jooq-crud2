package com.example.jooqcrud.Controller;

import com.example.jooqcrud.Model.EmployeeModel;
import com.example.jooqcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    @RequestMapping("/employees")
    public class EmployeeController {
        @Autowired
        private EmployeeService service;

        @PostMapping
        public String addEmployee(@RequestBody EmployeeModel employee){
            service.insertEmployee(employee);
            return "Employee added.";
        }

        @GetMapping
        public List<EmployeeModel> getEmployees(){
            return service.getAllEmployees();
        }

        @RequestMapping("/getID")
        public EmployeeModel getEmployeeByID(@RequestParam int ID){
            return service.getEmployeeByID(ID);
        }

        @DeleteMapping
        public String deleteEmployee(@RequestParam int ID){
             return service.deleteEmployee(ID);

        }

        @PutMapping("/update")
        public String updateEmployee(@RequestParam int ID, @RequestBody EmployeeModel employee){
            return service.updateEmployee(ID, employee);
        }

}
