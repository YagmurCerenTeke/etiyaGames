package etiyaGame;

import abstracts.CampaignManager;
import abstracts.GameManager;
import abstracts.MernisKpsServiceAdapter;
import abstracts.ScoreManager;
import abstracts.SellingManager;
import abstracts.UserManager;
import dao.CampaignDao;
import dao.GameDao;
import dao.UserDao;
import entities.Campaign;
import entities.Game;
import entities.Gamer;


public class Main {

	public static void main(String[] args) {
	
		Gamer gamer1 = new Gamer("Yagmur","Teke",2012,"12345678910", "Female", 100);
		Gamer gamer2 = new Gamer("Emre", "Ay", 1990, "12345678911", "Male", 100);
		Gamer gamer3 = new Gamer("Sevil","Tekin",1997,"12345678912", "Female", 100);
		Gamer gamer4 = new Gamer("Ercan","Teke",2009,"12345678913", "Male", 100);
		Gamer gamer5 = new Gamer("Ayşe","Aydın",1900,"12345678914", "Female", 100);
		
		
		UserManager userManager = new UserManager(new UserDao(), new MernisKpsServiceAdapter());
		userManager.add(gamer1);
		userManager.list();
		userManager.update(gamer2);
		userManager.delete(gamer3);
		
		System.out.println("----------");
		
		Game game1 = new Game(1, "The Sims", 150,100);
		Game game2 = new Game(2, "Call of Duty", 160,100);
		Game game3 = new Game(3, "BioShock", 170,100);
		Game game4 = new Game(4, "Portal", 180,100);
		Game game5 = new Game(5, "The Legend of Zelda", 100,100);

		GameManager gameManager = new GameManager(new GameDao());
		gameManager.add(game1);
		gameManager.list();
		gameManager.update(game2);
		gameManager.delete(game3);
		
		System.out.println("----------");
		
		Campaign campaign1 = new Campaign(1, "1 alana 1 bedava", 0.50);
		Campaign campaign2 = new Campaign(2, "%30 İndirim", 0.30);
		Campaign campaign3 = new Campaign(3, "Black Friday", 0.80);
		
		CampaignManager campaignManager = new CampaignManager(new CampaignDao());
		campaignManager.add(campaign1);
		campaignManager.list();
		campaignManager.update(campaign2);
		campaignManager.delete(campaign3);
		
		System.out.println("----------");
		
		SellingManager sellingManager = new SellingManager();
		sellingManager.selling(gamer5, game5, campaign3);
		sellingManager.selling(gamer5, game5);
		
		ScoreManager scoreManager = new ScoreManager();
		scoreManager.score(gamer1, game5);
		scoreManager.score(gamer2, game5);
		scoreManager.score(gamer5, game5);

	}

}
