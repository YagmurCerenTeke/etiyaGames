package dao;

import entities.User;

public class UserDao implements UserDaoRepository{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " has been added to database.");
		
	}

	@Override
	public void list() {
		System.out.println("Users are listed.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " has been updated to database.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " has been deleted from database.");
		
	}

}
