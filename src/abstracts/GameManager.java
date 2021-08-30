package abstracts;

import concretes.GameService;
import dao.GameDao;
import entities.Game;

public class GameManager implements GameService {

	GameDao gameDao;
	
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		gameDao.add(game);
		
	}

	@Override
	public void list() {
		gameDao.list();
		
	}

	@Override
	public void update(Game game) {
		gameDao.update(game);
		
	}

	@Override
	public void delete(Game game) {
		gameDao.delete(game);
		
	}

	
}
