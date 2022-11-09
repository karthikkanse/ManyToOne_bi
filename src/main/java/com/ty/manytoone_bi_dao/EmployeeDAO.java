package com.ty.manytoone_bi_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytoone_bi_dto.Employee;
import com.ty.manytoone_bi_dto.Office;

import java.util.*;
public class EmployeeDAO {
public void saveOffice(Office office)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	entityTransaction.begin();
	
	entityManager.persist(office);
	List<Employee> e=office.getEmployee();
	for(Employee emp:e)
	{
		entityManager.persist(emp);
	}
	
	entityTransaction.commit();
}
}
