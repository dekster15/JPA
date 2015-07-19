package ua.lviv.lgs.dao;

import java.util.List;

import ua.lviv.lgs.Book;

public interface BookDao extends BaseDao<Book> {
	List<Book> findByTitle(String title);


}
