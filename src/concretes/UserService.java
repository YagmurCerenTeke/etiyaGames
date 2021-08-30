package concretes;

import entities.User;

public interface UserService {
	
	void add(User user);
	
	void list();
	
	void update(User user);
	
	void delete(User user);
	
}
