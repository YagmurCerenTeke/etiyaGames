package concretes;

import entities.Campaign;
import entities.Game;
import entities.User;

public interface SellingService {
	
	void selling(User user, Game game);

	void selling(User user,Game game, Campaign campaign);
}
