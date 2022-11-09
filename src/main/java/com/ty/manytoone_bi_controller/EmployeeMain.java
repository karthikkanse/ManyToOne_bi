package com.ty.manytoone_bi_controller;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytoone_bi_dao.EmployeeDAO;
import com.ty.manytoone_bi_dto.Employee;
import com.ty.manytoone_bi_dto.Office;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		
		Office o=new Office();
		o.setName("TestYantra");
		o.setAddress("Basavanagudi");
		
		
		Employee e1=new Employee();
		e1.setName("Abhi");
		e1.setEmail("abhi@123");
		e1.setAddress("BNG");
		e1.setOffice(o);
		
		Employee e2=new Employee();
		e2.setName("kumar");
		e2.setEmail("kumi@111");
		e2.setAddress("MYS");
		e2.setOffice(o);

		
		Employee e3=new Employee();
		e3.setName("umesh");
		e3.setEmail("um@444");
		e3.setAddress("BLGV");
		e3.setOffice(o);
		
		List<Employee> l=new ArrayList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		o.setEmployee(l);
		
		EmployeeDAO dao=new EmployeeDAO();
		dao.saveOffice(o);
	}

}
