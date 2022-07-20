package com.MarkettingApp1.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MarkettingApp1.entities.Item;
import com.MarkettingApp1.entities.Lead;
import com.MarkettingApp1.repositry.ItemRepositry;
import com.MarkettingApp1.repositry.LeadRepositry;
@Service
public class LeadItemserviceimpl implements LeadItemservice {
     
	@Autowired
	private LeadRepositry leadrepo;
	@Autowired
	private ItemRepositry itemrepo;
	
	@Override
	public void savealllead(Lead lead) {
		leadrepo.save(lead);
		
	}

	


	

	@Override
	public void saveallItem(Item item) {
		itemrepo.save(item);
		
	}

	

	
}
