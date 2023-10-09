package com.codeWithNagas.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import org.hibernate.service.spi.SessionFactoryServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    		StudentName sn = new StudentName();
    		sn.setFname("Pavan");
    		sn.setMname("S");
    		sn.setLname("Gowda");
    		Test table = new Test();
    		table.setSid(1011);
    		
    		table.setColor("green");
    		
    		table.setSname(sn);
    		
    		Configuration con  = new Configuration().configure().addAnnotatedClass(Test.class);
    		
    		ServiceRegistry   reg =new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    		SessionFactory sf = con.buildSessionFactory(reg);
    		
    		
    		Session session = sf.openSession();
    		
    		Transaction tx = session.beginTransaction();
    		session.save(table);
    		
    		table = (Test) session.get(Test.class, 105);
    		tx.commit();
    		
    		System.out.println(table);
    }
}
