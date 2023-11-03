package com.techxyte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
   
		public static void main(String[] args) {    
		      
		   try {
		      
		    SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		    Session session=factory.openSession();  
		      
		    Transaction t=session.beginTransaction();    
		        
		    Employee e1=new Employee();    
		    e1.setName("Ravi kumar");    
		    e1.setEmail("ravi@gmail.com");    
		      
		    Employee e2=new Employee();  
		    e2.setName("Arun ");  
		    e2.setEmail("arun@gmail.com");  
		        
		    Address address1=new Address();    
		    address1.setAddressLine1("Banashankari");    
		    address1.setCity("banglore");    
		    address1.setState("karnataka");    
		    address1.setCountry("India");    
		    address1.setPincode(578390);    
		        
		    e1.setAddress(address1);    
		    e2.setAddress(address1);  
		  
		    session.persist(e1);    
		    session.persist(e2);  
		    t.commit();    
		        
		    session.close();    
		    System.out.println("successfully complited");    
		    
		    
		}   
		   catch(Exception e) {
			   System.out.println("Exception"+e);
		   }
		}    
}
	


