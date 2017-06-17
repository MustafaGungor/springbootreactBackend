package com.javamg.service;

import com.javamg.entity.Department;

import java.util.List;

/**
 * Created by ucakyunus on 10.06.2017.
 */
public interface DepartmentService extends BaseService {

    void getId(Integer id);

    void createDepartment(Department department);

    void updateDepartment(Integer id);

    void deleteDepartment(Integer id);

    List<Department> getAllDepartment();
}
