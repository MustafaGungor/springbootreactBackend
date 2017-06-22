package com.javamg.controller;

import com.javamg.entity.Department;
import com.javamg.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
@RestController
@RequestMapping("department")
@CrossOrigin(origins = "http://localhost:3000")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "read", method = RequestMethod.GET)
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }

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
