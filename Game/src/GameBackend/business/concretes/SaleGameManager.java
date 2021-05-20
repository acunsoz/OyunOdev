package GameBackend.business.concretes;

import GameBackend.business.abstracts.SaleGameService;
import GameBackend.entities.concretes.Campaign;
import GameBackend.entities.concretes.Game;
import GameBackend.entities.concretes.Player;

public class SaleGameManager implements SaleGameService{

	@Override
	public void sale(Game game, Player player) {
		System.out.println("Tebrikler "+ player.getFirstName()+" "+game.getGameName()+" "+game.getPrice() +" fiyatýna "+" oyunu aldýn güle güle oyna");
		
	}
	

	@Override
	public void restitute(Game game, Player player) {
		System.out.println("Sevgili "+player.getFirstName() + " " +game.getGameName()+" adlý oyunu iade etmene üzüldük.");
		
	}
	@Override
	public void campaignSale(Game game, Player player, Campaign campaign) {
		System.out.println("Tebrikler "+ player.getFirstName()+" "+game.getGameName()+" "+game.getPrice() +" fiyatlý oyunu "+campaign.getCampaignName()+" adlý kampanya ile "+(game.getPrice()-campaign.getDicount())+" fiyatýna "+" oyunu aldýn güle güle oyna");
		
	}
	@Override
	public void campaignRestitute(Game game, Player player, Campaign campaign) {
		System.out.println("Sevgili "+player.getFirstName() + " " +game.getGameName()+" adlý oyunu aldýgýn "+(game.getPrice()-campaign.getDicount())+" fiyat ile sana iade ettik.");
		
	}

}
