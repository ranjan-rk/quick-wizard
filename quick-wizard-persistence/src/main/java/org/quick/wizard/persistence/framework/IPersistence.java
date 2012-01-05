package org.quick.wizard.persistence.framework;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;

public interface IPersistence {

    Object save(Object entity);

    Iterable<Object> save(Iterable<? extends Object> entities);

    Object findOne(Query query, Class<?> clazz);

    List<?> findAll(Class<?> clazz);

    List<?> find(Query query, Class<?> clazz);

    void delete(Object entity);
}
