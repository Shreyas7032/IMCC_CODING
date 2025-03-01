package com.tybcs.all;

import java.util.Iterator;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.criteria.From;
import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
	private static SessionFactory factory;
	
    public static void main( String[] args )
    {
        try {
        	factory=new Configuration().configure().buildSessionFactory();
        }catch (Exception e) {
			// TODO: handle exception
		}
        
        App obj=new App();
        
       Integer studid1=obj.addStudent(1, "xyz","Jadhav");
       Integer studid2=obj.addStudent(2, "ghd","Jadhav");
       Integer studid3=obj.addStudent(3, "uri","Jadhav");
       
       obj.show();
       obj.updateStud(studid2,"xya");
       
       obj.show();
       
       obj.delete(studid2);
       
       obj.show();
       
       
    }
    private Integer addStudent(int id,String name,String sal)
    {
    	
    		Session session=factory.openSession();
    		Transaction tx=null;
    		Integer studid=null;
    	try {
    		tx=session.beginTransaction();
    		Student s1=new Student(id,name,sal);
    		studid=(Integer) session.save(s1);
    		tx.commit();
    		JOptionPane.showMessageDialog(null,"Stusde addes");
    	}catch(HibernateException e)
    	{
    		if(tx!=null)
    			tx.rollback();
    	}
    	finally {
			session.close();
		}
    	return studid; 	
    }
    
 	
    private void updateStud(int id,String sal)
    {
    	Session session=factory.openSession();
    	Transaction tx=null;
    	try
    	{
    		tx=session.beginTransaction();
    		Student s1=(Student) session.get(Student.class,id);
    		s1.setSal(sal);
    		session.update(s1);
    		tx.commit();
    		JOptionPane.showMessageDialog(null,"sal Updated of "+id);
    		
    		
    		
    		
    	}catch (HibernateException e) {
			if(tx!=null)
				tx.rollback();
		}finally {
			session.close();
		}
    }
    
    private void delete(int id)
    {
    	Session session=factory.openSession();
    	Transaction tx=null;
    	try
    	{
    		tx=session.beginTransaction();
    		Student s1=(Student) session.get(Student.class,id);
    		session.delete(s1);
    		tx.commit();
    		JOptionPane.showMessageDialog(null,"Student deleted="+id);
    		
    	}catch (Exception e) {
			if(tx!=null)
				tx.rollback();
		}
    	finally {
			session.close();
		}
    	
    	
    }
    
    
    private void show()
    {
    	Session session=factory.openSession();
    	Transaction tx=null;
    	try
    	{
    		tx=session.beginTransaction();
	    	List l1=session.createQuery("From Student").list();
	    	
	    	System.out.println("\n\t Student are=========\n\t");
	    	
	    	for(Iterator iterator=l1.iterator();iterator.hasNext();)
	    	{
	    		Student s1=(Student) iterator.next();
	    		System.out.println(s1);
	    	}
	    	tx.commit();
    	}catch (Exception e) {
			if(tx!=null)
				tx.rollback();
			System.out.println(e);
		}
    	finally {
			session.close();
		}
    }
    
    
    
    
    
    
    
}
