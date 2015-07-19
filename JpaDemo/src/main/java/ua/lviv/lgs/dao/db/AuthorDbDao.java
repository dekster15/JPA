package ua.lviv.lgs.dao.db;

import java.util.List;

import javax.persistence.TypedQuery;


import ua.lviv.lgs.Author;
import ua.lviv.lgs.Book;
import ua.lviv.lgs.dao.AuthorDao;

public class AuthorDbDao extends BaseDbDao<Author> implements AuthorDao {


	
	@Override
	public List<Author> findByName(String name) {
	    return em.createQuery(
	        "SELECT a FROM Author a WHERE a.name LIKE :custName")
	        .setParameter("custName", name)
	        .getResultList();
	}
	
	
	@Override
	public List<Author> findByAge(int age) {
	    return em.createQuery(
	        "SELECT a FROM Author a WHERE a.age LIKE :custAge")
	        .setParameter("custAge", age)
	        .getResultList();
	}





	


}
