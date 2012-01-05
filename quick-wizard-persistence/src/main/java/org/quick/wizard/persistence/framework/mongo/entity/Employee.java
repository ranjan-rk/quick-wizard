package org.quick.wizard.persistence.framework.mongo.entity;

import java.io.Serializable;

import org.quick.wizard.persistence.framework.mongo.MongoCollection;

@MongoCollection(name = "employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String employeeName;
    private String designation;

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getEmployeeName() {
	return employeeName;
    }

    public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
    }

    public String getDesignation() {
	return designation;
    }

    public void setDesignation(String designation) {
	this.designation = designation;
    }
}
