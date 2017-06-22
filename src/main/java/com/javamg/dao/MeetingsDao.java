package com.javamg.dao;

import com.javamg.entity.Meetings;
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
public class MeetingsDao implements BaseDao<Meetings> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Meetings getId(int id) {
        return null;
    }

    @Override
    public void create(Meetings meetings) {
        entityManager.persist(meetings);
    }

    @Override
    public void update(Meetings meetings) {

    }

    @Override
    public void delete(Integer id) {
        entityManager.remove(getId(id));
    }

    @Override
    public List<Meetings> getAllList() {
        String hql = "FROM Meetings ";
        return (List<Meetings>) entityManager.createQuery(hql).getResultList();
    }

}
