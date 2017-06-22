package com.javamg.dao;

import com.javamg.entity.Department;
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
public class DepartmentDao implements BaseDao<Department> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Department getId(int id) {
        return null;
    }

    @Override
    public void create(Department department) {
        entityManager.persist(department);
    }

    @Override
    public void update(Department department) {

    }

    @Override
    public void delete(Integer id) {
        entityManager.remove(getId(id));
    }

    @Override
    public List<Department> getAllList() {
        String hql = "FROM Department ";
        return (List<Department>) entityManager.createQuery(hql).getResultList();
    }


}
