package com.MarkettingApp1.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.MarkettingApp1.entities.Lead;
import com.MarkettingApp1.repositry.ItemRepositry;
import com.MarkettingApp1.repositry.LeadRepositry;

@RestController
public class LeadRestController {
	@Autowired
	private LeadRepositry leadrepo ;
	@Autowired 
	private ItemRepositry itemrepo;
	
	@GetMapping("/getallOrder")
	public List<Lead> getlead() {
		
		List<Lead> leads = leadrepo.findAll();
		
		return leads;
		
	}
	@GetMapping("/getorderbyid/{2}")
	public Lead getleadbyId(@PathVariable long id) {
		
		Optional<Lead> findById = leadrepo.findById(id);
		  Lead lead = findById.get();
		
		return lead;
		
	}
	
	
	
	@PostMapping("/postorder")
 public void savebyid(@RequestBody Lead lead) {
		
		leadrepo.save(lead);
		
		
	}

}
