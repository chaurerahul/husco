package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
//		Customer customer = new Customer();
//		customer.setId(2);
//		customer.setName("Abc");
//		customer.setAddress("Pune");
//		
//		session.save(customer);
//		session.beginTransaction().commit();
//		System.out.println("Data Inserted");
		
		
		Customer customer = session.get(Customer.class, 2);
		customer.setName("Xyz");
		session.update(customer);
		session.beginTransaction().commit();
		System.out.println("Data Updated");
		
	}
}
