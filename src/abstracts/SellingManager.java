package abstracts;

import concretes.SellingService;
import entities.Campaign;
import entities.Game;
import entities.User;

public class SellingManager implements SellingService{

	
	@Override
	public void selling(User user, Game game) {
		System.out.println(game.getName() + " oyunu " + user.getFirstName() + " isimli oyuncu tarafından satın alınmıştır.");
		
	}

	@Override
	public void selling(User user, Game game, Campaign campaign) {
		double gamePriceAfterDiscount = game.getPrice()-(game.getPrice()*campaign.getDiscountRate());
		System.out.println(game.getName() + " oyunu " + user.getFirstName() + " isimli oyuncu tarafından "
				+ campaign.getName() + " kampanyası kapsamında " + gamePriceAfterDiscount + " TL'ye satın alınmıştır.");
		
	}

}
