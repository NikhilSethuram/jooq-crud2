package com.example.jooqcrud.Controller;

import com.example.jooqcrud.service.EmployeeService;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    @RequestMapping("/employees")
    public class EmployeeController {
        @Autowired
        private EmployeeService service;

        @PostMapping
        public String addEmployee(@RequestBody Employee employee){
            service.insertEmployee(employee);
            return "Employee added.";
        }

        @GetMapping
        public List<Employee> getEmployees(){
            return service.getAllEmployees();
        }

        @RequestMapping("/getID")
        public List<Employee> getEmployeeByID(@RequestParam int ID){
            return service.getEmployeeByID(ID);
        }

        @DeleteMapping
        public String deleteEmployee(@RequestParam int ID){
             service.deleteEmployee(ID);
             return "Employee deleted.";
        }


}
