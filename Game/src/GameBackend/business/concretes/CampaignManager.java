package GameBackend.business.concretes;

import GameBackend.business.abstracts.CampaignService;
import GameBackend.entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adlý kampanya eklendi");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adlý kampanya silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adlý kampanya güncellendi");
		
	}

}
