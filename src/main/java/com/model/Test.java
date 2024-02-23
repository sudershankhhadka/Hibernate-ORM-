package com.model;

import org.hibernate.SessionFactory;
import java.util.List;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		add();
//		getAll();
//		update();
//		delete();
	}


//add product 
   static void add() {
	   SessionFactory sf = new Configuration().configure().buildSessionFactory();
	   Session session = sf.openSession();
	   session.beginTransaction();
	   
	   Product pd = new Product();
	   pd.setName("Laptop");
	   pd.setPrice(123423);
	   pd.setId(2);
	   pd.setCompany("Lenovo");
	   
	   pd.setName("Mobile");
	   pd.setPrice(10000);
	   
	   pd.setId(2);
	   pd.setCompany("Samsung");
	   
	   pd.setName("Battery");
	   pd.setPrice(1300);
	   pd.setId(3);
	   pd.setCompany("Nokia");
	   
	   pd.setName("Charger");
	   pd.setPrice(3000);
	   pd.setId(4);
	   pd.setCompany("Toshiba");
	   
	   pd.setName("Monitor");
	   pd.setPrice(100000);
	   pd.setId(5);
	   pd.setCompany("Samsung");
	   
	   session.save(pd);   //insert sql
	   session.getTransaction().commit(); //execute
	   session.close();
	   
   }
   
   //getAll data
   
//   static void getAll() {
//	   SessionFactory sf = new Configuration().configure().buildSessionFactory();
//	   Session session = sf.openSession();
//	   
//	   Criteria crt = session.createCriteria(Product.class);
//	   //where clause
//	   
//	   crt.add(Restrictions.eq("company", "samsung"));
//	   
//	   
//	   /*
//	    * eq= equals
//	    * gt= greater than
//	    * lt= less than
//	    * le = less or equals
//	    * ge = greater or equal
//	    */
//	   List<Product>  plist= crt.list();  //select sql
//	   System.out.println(plist);
//   }
//   
//   
//   
//   //update 
//   
//   
//    static void update() {
//    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
// 	   Session session = sf.openSession();
// 	   session.beginTransaction();
// 	   
// 	   Product p = (Product)session.get(Product.class, 3);
// 	   p.setCompany("Lenovo");
// 	   p.setPrice(p.getPrice()-1200);
// 	   
// 	   
// 	   session.update(p);
// 	   session.getTransaction().commit();
// 	   session.beginTransaction();
// 	   
// 	   
// 	   
//    	
//    }
//    //delete 
//    
//    static void delete() {
//    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
// 	   Session session = sf.openSession();
// 	   session.beginTransaction();
// 	   
// 	   
// 	   
// 	   Product p = (Product) session.get(Product.class, 4);
// 	   
// 	   session.delete(p);
// 	   session.getTransaction().commit();
// 	   session.close();
//    }
    
    
}