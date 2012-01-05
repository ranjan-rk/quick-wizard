package org.quick.wizard.persistence.framework.mongo;

import java.util.List;

import org.quick.wizard.persistence.framework.IPersistence;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;

public class MongoDbPersistance implements IPersistence {
    MongoOperations mongoOperations;

    @Override
    public void delete(Object entity) {
	// TODO Auto-generated method stub

    }

    @Override
    public List<?> find(Query query, Class<?> clazz) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<?> findAll(Class<?> clazz) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Object findOne(Query query, Class<?> clazz) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Object save(Object entity) {
	mongoOperations.save(entity, ((MongoCollection) entity.getClass().getAnnotation(MongoCollection.class)).name());
	return entity;
    }

    @Override
    public Iterable<Object> save(Iterable<? extends Object> entities) {
	// TODO Auto-generated method stub
	return null;
    }

    public MongoOperations getMongoOperations() {
	return mongoOperations;
    }

    public void setMongoOperations(MongoOperations mongoOperations) {
	this.mongoOperations = mongoOperations;
    }

}
