package GameBackend;

import GameBackend.adapter.PlayerValidateManager;
import GameBackend.business.concretes.CampaignManager;
import GameBackend.business.concretes.PlayerManager;
import GameBackend.business.concretes.SaleGameManager;
import GameBackend.entities.concretes.Campaign;
import GameBackend.entities.concretes.Game;
import GameBackend.entities.concretes.Player;

public class Main {
	
	public static void main(String[] args) {
	
		
		Player player1 =new Player(1,"Alihan","Acunsoz","1999","12345678912");
		Game game1 = new Game(1,"COD",150);
		Game game2 = new Game(2,"GTA",120);
		Campaign campaign1 = new Campaign(1,"Pandemi indirimi",20);
		
		
		
		
		PlayerManager playerManager =new PlayerManager(new PlayerValidateManager());
		playerManager.register(player1);
		playerManager.delete(player1);
		
		System.out.println("\n*********************************\n");
		
		SaleGameManager saleGameManager = new SaleGameManager();
		saleGameManager.sale(game1, player1);
		saleGameManager.campaignSale(game2, player1, campaign1);
		
		System.out.println("\n*********************************\n");
		
		CampaignManager campaignManager =new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		
		
	
	}
	
	
	
	
	
}
