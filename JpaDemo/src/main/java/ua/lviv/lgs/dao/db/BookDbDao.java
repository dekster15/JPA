package ua.lviv.lgs.dao.db;

import java.util.List;

import ua.lviv.lgs.Author;
import ua.lviv.lgs.Book;
import ua.lviv.lgs.dao.BookDao;

public class BookDbDao extends BaseDbDao<Book> implements BookDao {

	
	public List<Book> findByTitle(String title) {
	    return em.createQuery(
	        "SELECT b FROM Book b WHERE b.title LIKE :custTitle")
	        .setParameter("custTitle", title)
	        .getResultList();
	}




}
