package GameBackend.business.concretes;

import GameBackend.business.abstracts.SaleGameService;
import GameBackend.entities.concretes.Campaign;
import GameBackend.entities.concretes.Game;
import GameBackend.entities.concretes.Player;

public class SaleGameManager implements SaleGameService{

	@Override
	public void sale(Game game, Player player) {
		System.out.println("Tebrikler "+ player.getFirstName()+" "+game.getGameName()+" "+game.getPrice() +" fiyat�na "+" oyunu ald�n g�le g�le oyna");
		
	}
	

	@Override
	public void restitute(Game game, Player player) {
		System.out.println("Sevgili "+player.getFirstName() + " " +game.getGameName()+" adl� oyunu iade etmene �z�ld�k.");
		
	}
	@Override
	public void campaignSale(Game game, Player player, Campaign campaign) {
		System.out.println("Tebrikler "+ player.getFirstName()+" "+game.getGameName()+" "+game.getPrice() +" fiyatl� oyunu "+campaign.getCampaignName()+" adl� kampanya ile "+(game.getPrice()-campaign.getDicount())+" fiyat�na "+" oyunu ald�n g�le g�le oyna");
		
	}
	@Override
	public void campaignRestitute(Game game, Player player, Campaign campaign) {
		System.out.println("Sevgili "+player.getFirstName() + " " +game.getGameName()+" adl� oyunu ald�g�n "+(game.getPrice()-campaign.getDicount())+" fiyat ile sana iade ettik.");
		
	}

}
