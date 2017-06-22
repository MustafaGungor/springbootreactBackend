package com.javamg.dao;

import com.javamg.entity.BaseEntity;

import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
public interface BaseDao<T extends BaseEntity> {
    T getId(int id);

    void create(T t);

    void update(T t);

    void delete(Integer id);

    List<T> getAllList();
}
