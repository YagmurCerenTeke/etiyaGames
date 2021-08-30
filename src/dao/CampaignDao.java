package dao;

import entities.Campaign;

public class CampaignDao implements CampaignDaoRepository {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " has been added to database.");
		
	}

	@Override
	public void list() {
		System.out.println("Campaigns are listed.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " has been updated to database.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " has been deleted from database.");
		
	}

	
}
