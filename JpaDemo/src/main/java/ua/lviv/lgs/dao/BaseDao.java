package ua.lviv.lgs.dao;


import java.util.List;

import ua.lviv.lgs.Author;
import ua.lviv.lgs.Book;

public interface BaseDao<T> {
	void create(T a);

	T findById(Object id);  //+
	void delete(Object id); //+
	void add(Object T);     //+
	List<T> findAll();
	void upDate(Object id);
	

	
}
