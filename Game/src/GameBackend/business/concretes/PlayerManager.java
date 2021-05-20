package GameBackend.business.concretes;

import GameBackend.adapter.PlayerValidateService;
import GameBackend.business.abstracts.PlayerService;
import GameBackend.entities.concretes.Player;

public class PlayerManager implements PlayerService {
	
	PlayerValidateService playerValidateService;
	
	public PlayerManager(PlayerValidateService playerValidateService) {
		super();
		this.playerValidateService=playerValidateService;		
	}

	@Override
	public void register(Player player) {
		
		if(playerValidateService.validate(player)) {
			
			System.out.println(player.getFirstName() + " adl� kullan�c� kay�t oldu.");
		}
		
		else {
			
			System.out.println("Ge�ersiz kullan�c� bilgileri");
		}
		
	}

	@Override
	public void delete(Player player) {
		
		if(playerValidateService.validate(player)) {
			System.out.println(player.getFirstName() + " adl� kullan�c� silindi.");
		}
		else {
			System.out.println("Ge�ersiz kullan�c� bilgileri");
		}
	}

	@Override
	public void update(Player player) {
		
		if(playerValidateService.validate(player)) {
			System.out.println(player.getFirstName() + " adl� kullan�c� bilgileri g�ncellendi.");
		}
		else {
			System.out.println("Ge�ersiz kullan�c� bilgileri");
		}
		
	}

}
