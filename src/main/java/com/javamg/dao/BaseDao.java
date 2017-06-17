package com.javamg.dao;

import com.javamg.entity.BaseEntity;

import java.util.List;

/**
 * Created by ucakyunus on 10.06.2017.
 */
public interface BaseDao<T extends BaseEntity> {
    T getId(int id);

    void create(T t);

    void update(T t);

    void delete(Integer id);

    List<T> getAllList();
}
