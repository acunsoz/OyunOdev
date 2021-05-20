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
			
			System.out.println(player.getFirstName() + " adlý kullanýcý kayýt oldu.");
		}
		
		else {
			
			System.out.println("Geçersiz kullanýcý bilgileri");
		}
		
	}

	@Override
	public void delete(Player player) {
		
		if(playerValidateService.validate(player)) {
			System.out.println(player.getFirstName() + " adlý kullanýcý silindi.");
		}
		else {
			System.out.println("Geçersiz kullanýcý bilgileri");
		}
	}

	@Override
	public void update(Player player) {
		
		if(playerValidateService.validate(player)) {
			System.out.println(player.getFirstName() + " adlý kullanýcý bilgileri güncellendi.");
		}
		else {
			System.out.println("Geçersiz kullanýcý bilgileri");
		}
		
	}

}
