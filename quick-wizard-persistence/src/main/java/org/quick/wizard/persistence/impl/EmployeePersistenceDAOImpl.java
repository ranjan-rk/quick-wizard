package org.quick.wizard.persistence.impl;

import org.quick.wizard.persistence.EmployeePersistenceDAO;
import org.quick.wizard.persistence.framework.mongo.MongoDbPersistance;
import org.quick.wizard.persistence.framework.mongo.entity.Employee;

public class EmployeePersistenceDAOImpl extends MongoDbPersistance implements EmployeePersistenceDAO {

    @Override
    public void saveEmployee(Employee employee) {
	save(employee);

    }
}
