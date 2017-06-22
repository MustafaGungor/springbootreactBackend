package com.javamg.dao;

import com.javamg.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
@Transactional
@Repository
public class EmployeeDao implements BaseDao<Employee> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Employee getId(int id) {
        return null;
    }

    @Override
    public void create(Employee employee) {
        entityManager.persist(employee);
    }

    @Override
    public void update(Employee employee) {
        Employee employee1 = getId(employee.getId());
        employee1.setName(employee.getName());
        employee1.setSurname(employee.getSurname());
        employee1.setSalary(employee.getSalary());
        entityManager.flush();
    }

    @Override
    public void delete(Integer id) {
        entityManager.remove(id);
    }

    @Override
    public List<Employee> getAllList() {
        String hql = "FROM Employee ";
        return entityManager.createQuery(hql).getResultList();
    }
}
