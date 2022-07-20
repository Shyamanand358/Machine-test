package com.MarkettingApp1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.MarkettingApp1.entities.Item;
import com.MarkettingApp1.entities.Lead;
import com.MarkettingApp1.services.LeadItemservice;



@Controller
public class LeadItemController {
      @Autowired
	 private LeadItemservice leaditemservice;
     
	
	
@RequestMapping("/leadgenerate")
public String view() {
	
	return "Creat_order";
}

@RequestMapping("/Itemgenerate")
public String views() {
	
	return "Creat_item";
}




	@RequestMapping("/saveOrder")
	public String saveleads(@ModelAttribute Lead lead,   ModelMap  model) {
		leaditemservice.savealllead(lead);
		model.addAttribute("savemsg", "Order is saved sucessfully");
		return "Creat_order";	
	}
	@RequestMapping("/saveItem")
	public String saveItems(@ModelAttribute Item item, ModelMap model) {
		leaditemservice.saveallItem(item);
		model.addAttribute("savemsg1", "Itemns details is saved sucessfully");
		return "Creat_order";	
	}
	
	
	
	

}
