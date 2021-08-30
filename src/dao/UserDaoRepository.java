package dao;

import entities.User;

public interface UserDaoRepository {
	
	void add(User user);
	
	void list();
	
	void update(User user);
	
	void delete(User user);
	
}
