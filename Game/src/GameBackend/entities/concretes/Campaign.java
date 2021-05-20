package GameBackend.entities.concretes;

import GameBackend.entities.abstracts.Entity;

public class Campaign implements Entity{
	private int id;
	private String campaignName;
	private int dicount;
	
	public Campaign(int id, String campaignName, int dicount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.dicount = dicount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDicount() {
		return dicount;
	}

	public void setDicount(int dicount) {
		this.dicount = dicount;
	}
}
