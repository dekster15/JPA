package ua.lviv.lgs.dao;

import java.util.List;


import ua.lviv.lgs.Author;

public interface AuthorDao extends BaseDao<Author> {


	public List<Author> findByName(String name) ;

	List<Author> findByAge(int age);



	


	
}
