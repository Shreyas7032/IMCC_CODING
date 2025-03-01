package com.tybcs.All_operation;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	private static SessionFactory factory;
    public static void main( String[] args )
    {
        try {
			factory=new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			// TODO: handle exception
		}
        
      App obj=new App();
      
      Integer studId1=obj.addStudent(1,"Shreyas","jadhav");
      Integer studId2=obj.addStudent(2,"Tejas","jadhav");
      Integer studId3=obj.addStudent(3,"Nikita","jadhav");
      
      obj.update(1, "Roohit");
      obj.delete(1);
      
        
        
        
    }
    public Integer addStudent(int roll,String name,String last)
    {
    	Session session=factory.openSession();
    	Transaction tx=null;
    	Integer studId=null;
    	try {
    		tx=session.beginTransaction();
			Student s1=new Student(roll,name,last);
    		studId=(Integer) session.save(s1);
    		tx.commit();
    		session.close();
    		JOptionPane.showMessageDialog(null,"Data Added Successfullt");
    	}catch (Exception e) {
			// TODO: handle exception
		}
    	return studId;
    }
    
    public void update(int roll,String name)
    {
    	Session session=factory.openSession();
    	Transaction tx=null;
    	
    	try
    	{
    		tx=session.beginTransaction();
    		Student s1=(Student) session.load(Student.class, 1);
    		s1.setName(name);
    		session.update(s1);
    		tx.commit();
    	}catch (Exception e) {
			// TODO: handle exception
		}
    	
    }
    public void delete(int roll)
    {
    	Session session=factory.openSession();
    	Transaction tx=null;
    	
    	try
    	{
    		tx=session.beginTransaction();
    		Student s1=(Student) session.load(Student.class, 1);
    		session.delete(s1);
    		tx.commit();
    	}catch (Exception e) {
			// TODO: handle exception
		}
    	
    }
    
}
