package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



import ua.lviv.lgs.dao.AuthorDao;
import ua.lviv.lgs.dao.BookDao;
import ua.lviv.lgs.dao.DaoFactory;


public class Main {
	
	public static void main(String[] args) {
		AuthorDao aDao = DaoFactory.getInstance().getAuthorDao();
		BookDao bDao = DaoFactory.getInstance().getBookDao();
		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("primary");
				EntityManager em = factory.createEntityManager();
				em.getTransaction().begin();
		
//// Create Author
		Author a = new Author("Taras", 56);
		Author a2 = new Author("Jon", 25);
		Author a3 = new Author("Stiven", 30);
		Author a4 = new Author("Alex", 35);
		Author a5 = new Author("Denis", 40);
	

		
//// Delete Author	
//		aDao.delete(6);
//
//// Create Book
		Book b = new Book("Kobzar", a);
		Book b1 = new Book("LordOfTheRing", a2);
		Book b2 = new Book("11\22\63", a3);
		Book b3 = new Book("NightShow", a4);
		Book b4 = new Book("Angel", a5);
		
// Add Book
//		bDao.add(b);
//		bDao.add(b1);
//		bDao.add(b2);
//		bDao.add(b3);
//		bDao.add(b4);
	
//		
//// Delete book
//        bDao.delete(3);
//        
//// Find authorById
 System.out.println( aDao.findById(3));
		
// Update Book
//		b2.setTitle("Death");
//		bDao.upDate(b2);
		
//findAll authors
System.out.println(aDao.findAll());
			
//FindAllBook						 
System.out.println(bDao.findAll());
	 
////FindAuthorByname
System.out.println(aDao.findByName("Jon"));
		  
////FindBookByTitle	  
System.out.println( bDao.findByTitle("Angel"));
	  
//FindAuthorByAge
System.out.println(aDao.findByAge(30));

		  

 //close
		 em.getTransaction().commit();
			 em.close();
			 factory.close();
	}

}
