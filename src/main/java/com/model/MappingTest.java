package com.model;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingTest {
	public static void main(String[] args) {
	//oneToOne();

	OneToMany();
}
	
	//one to one
	static void oneToOne() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		   Session session = sf.openSession();
		   session.beginTransaction();
		   
		   Address adr = new Address();
		   adr.setCity("Kathmandu");
		   adr.setCountry("Nepal");
		   adr.setState("Bagmati");
		   
		   
		   session.save(adr);
		   
		   Employee emp = new Employee();
		 
		   emp.setFname("Sudershan");
		   emp.setLname("Khadka");
		   emp.setSalary(1232323);
		   
		   
		   session.save(emp);
		   session.getTransaction().commit();
		   
	}
	
	//oneToMany
	static void OneToMany() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		   Session session = sf.openSession();
		   session.beginTransaction();
		   
		   Address adr = new Address();
		   adr.setCity("Kathmandu");
		   adr.setCountry("Nepal");
		   adr.setState("Bagmati");
		   
		   
		   session.save(adr);
		   
		   Employee emp = new Employee();
		 
		   emp.setFname("Sudershan");
		   emp.setLname("Khadka");
		   emp.setSalary(1232323);
		   
		   
		   
		   Phone p = new Phone();
		   p.setEmployee(emp);
		   p.setNumber("12343234");
		   p.setType("NTC");
			 session.save(p);
		   
		   Phone p1 = new Phone();
		   
		   p1.setEmployee(emp);
		   p.setNumber("679878");
		   p.setType("Ncell");
		   
		   session.save(p1);
		   
	
		 
			emp.setPhoneList(Arrays.asList(p,p1));	 
		   
		   session.save(emp);
		   session.getTransaction().commit();
		   
	}
	
	
	
	
}
