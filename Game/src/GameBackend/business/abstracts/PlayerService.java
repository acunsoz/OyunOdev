package GameBackend.business.abstracts;

import GameBackend.entities.concretes.Player;

public interface PlayerService {
	
	void register(Player player);
	void delete(Player player);
	void update(Player player);
	
}
