package com.controller;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.model.Ticket;
import com.service.TicketService;
@Controller
public class TicketController {
@Autowired
private TicketService ticketService;
	@RequestMapping(value="/showpage",method=RequestMethod.GET)
	public String showPage(@ModelAttribute("ticket") Ticket ticket){
	    String page="showpage";
	    return page;
	}
	@RequestMapping(value="/calculateCost",method=RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("ticket") Ticket ticket,ModelMap model,BindingResult result) {
		String page="result";
		double calculateTotalCost=ticketService.calculateTotalCost(ticket);
		model.addAttribute("cost",calculateTotalCost);
		return page;
	}
    @ModelAttribute("circleList")
    public Map<String,String> buildState(){
        Map<String,String> circleList=new HashMap<String,String>();
        circleList.put("king","King");
        circleList.put("Queen","Queen");
        return circleList;
    }


}
