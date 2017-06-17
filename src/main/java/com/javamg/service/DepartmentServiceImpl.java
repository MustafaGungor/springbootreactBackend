package com.javamg.service;

import com.javamg.dao.DepartmentDao;
import com.javamg.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ucakyunus on 10.06.2017.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public void getId(Integer id) {

    }

    @Override
    public void createDepartment(Department department) {
        departmentDao.create(department);
    }

    @Override
    public void updateDepartment(Integer id) {
        departmentDao.getId(id);
    }

    @Override
    public void deleteDepartment(Integer id) {
        departmentDao.getId(id);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentDao.getAllList();
    }
}
