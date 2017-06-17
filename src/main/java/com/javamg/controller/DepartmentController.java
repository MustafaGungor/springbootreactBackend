package com.javamg.controller;

import com.javamg.entity.Department;
import com.javamg.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ucakyunus on 10.06.2017.
 */
@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "read", method = RequestMethod.GET)
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "post", method = RequestMethod.POST)
    public void createDepartment(Department department) {
        departmentService.createDepartment(department);
    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
    public void updateDepartment(@PathVariable("id") Integer id) {
        departmentService.updateDepartment(id);
    }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public void deleteDepartment(@PathVariable("id") Integer id) {
        departmentService.deleteDepartment(id);
    }
}
