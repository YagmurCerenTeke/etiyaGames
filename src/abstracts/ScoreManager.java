package abstracts;

import java.time.LocalDate;
import concretes.ScoreService;
import entities.Game;
import entities.Gamer;

public class ScoreManager implements ScoreService{
	
	@Override
	public void score(Gamer gamer, Game game) {
		if(LocalDate.now().getYear()-gamer.getBirthYear()<18) {
			gamer.setScore(game.getTotalScore()*1);
			System.out.println("Gamer has a total score of " + gamer.getScore());
		} else if(LocalDate.now().getYear()-gamer.getBirthYear()>70){
			gamer.setScore(game.getTotalScore()*0.9);
			System.out.println("Gamer has a total score of " + gamer.getScore());
		} else {
			gamer.setScore(game.getTotalScore()*0.7);
			System.out.println("Gamer has a total score of " + gamer.getScore());
		}
			}

}
