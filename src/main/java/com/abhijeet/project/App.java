package com.abhijeet.project;


import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
		try{
			System.out.println("Start");
			SQLQuery query = session.createSQLQuery("EXPLAIN SELECT * FROM megatab;");
			System.out.println(query.list());
			int index = query.list().toString().indexOf("cost");
			System.out.println(query.list().toString().substring(index+11, index+15));
			System.out.println("End YaY!!");
		}catch (Exception e){e.printStackTrace();}
		finally{
			if(session!=null)
				session.close();
		}
    }
}
