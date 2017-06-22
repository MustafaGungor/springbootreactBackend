package com.javamg.service;

import com.javamg.entity.Department;

import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
public interface DepartmentService extends BaseService {

    void getId(Integer id);

    void createDepartment(Department department);

    void updateDepartment(Integer id);

    void deleteDepartment(Integer id);

    List<Department> getAllDepartment();
}
