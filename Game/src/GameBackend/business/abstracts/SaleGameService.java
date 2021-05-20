package GameBackend.business.abstracts;

import GameBackend.entities.concretes.Campaign;
import GameBackend.entities.concretes.Game;
import GameBackend.entities.concretes.Player;

public interface SaleGameService {
	
	void sale(Game game,Player player);
	void restitute(Game game,Player player);
	void campaignSale(Game game,Player player,Campaign campaign);
	void campaignRestitute(Game game,Player player,Campaign campaign);

}
