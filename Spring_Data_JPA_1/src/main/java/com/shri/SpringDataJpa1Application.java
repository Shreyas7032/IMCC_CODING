package com.shri;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shri.Entity.Book;
import com.shri.Repo.BookRepository;

@SpringBootApplication
public class SpringDataJpa1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa1Application.class, args);
	}

	@Autowired
	BookRepository bk;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	//1.Save and Save All
//		Book b1=new Book();
//		b1.setA_Name("Shreyas");
//		b1.setB_Name("Java");
//		
//		Book b2=new Book();
//		b2.setA_Name("TEJAS");
//		b2.setB_Name("Python");
//		
//		Book b3=new Book();
//		b3.setA_Name("Kartikey");
//		b3.setB_Name("Php");
//		
//		bk.saveAll(Arrays.asList(b1,b2,b3));
		
	//2.Update :It Have nothing different method It has save method if data present at given id in table then it updates the data to new ...
		
//		Book b1=new Book();
//		b1.setId(1);
//		b1.setA_Name("Shreuu");
//		b1.setB_Name("Spring");
//		bk.save(b1);  //Also Update multiple records method are saveAll()
		
	//3.findById():  Find the records by id
		
//		Optional<Book> byId = bk.findById(1);
//		if(byId.isPresent())
//		{
//			System.err.println(byId.get());
//		}
//		else
//		{
//			System.err.println("Record Not Found..");
//		}
		
	//4.findAllById():
//		Iterable<Book> allById = bk.findAllById(Arrays.asList(1,2,3));
//		for(Book b:allById)
//		{
//			System.err.println(b);
//		}
		
	//5.existById()
		//System.err.println(bk.existsById(2));
		
	//6.deleteById():
//		bk.deleteById(1);
//		System.err.println("Data Deleted Succesfully..");
		
	//7.deleteAllById()
//		bk.deleteAllById(Arrays.asList(2,3));
//		System.err.println("Data Deleted Succesfully...");
		
	//8.deleteAll()
//		bk.deleteAll();
//		System.err.println("Data Deleted");
		
	//9.count()
		System.err.println("No of records are:"+bk.count());
		
	
		
		

		
		
		
		
		
	}

}
