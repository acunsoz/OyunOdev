package GameBackend.adapter;

import GameBackend.entities.concretes.Player;

public class PlayerValidateManager implements PlayerValidateService{

	@Override
	public boolean validate(Player player) {
		
		if(player.getFirstName().length()>2 && player.getLastName().length()>2 &&
				player.getDateOfBirth().length()==4 && player.getNationalityId().length()==11)
		{
			
			return true;
		} 
		else {
			System.out.println("Girilen bilgiler yanlýþ");
			return false;
		}
	}

	

}
