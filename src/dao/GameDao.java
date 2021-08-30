package dao;

import entities.Game;

public class GameDao implements GameDaoRepository {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " has been added to database.");
		
	}

	@Override
	public void list() {
		System.out.println("Games are listed.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " has been updated to database.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " has been deleted from database.");
		
	}


}
