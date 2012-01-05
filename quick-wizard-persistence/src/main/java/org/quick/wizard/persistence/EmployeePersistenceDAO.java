package org.quick.wizard.persistence;

import org.quick.wizard.persistence.framework.mongo.entity.Employee;

public interface EmployeePersistenceDAO {
    void saveEmployee(Employee employee);
}
