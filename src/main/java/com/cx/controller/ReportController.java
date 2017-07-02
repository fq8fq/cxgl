package com.cx.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.cx.entity.ReportSell;
import com.cx.service.ReportSellService;


@Controller
public class ReportController {

	
    @Autowired
    private ReportSellService reportSellService;

	    @RequestMapping(value="/report/sell")
	    public String reportSell(/*@RequestParam("username") String username, 
	                           @RequestParam("password") String password,*/Map<String,Object> map){
	    	List<ReportSell> list = reportSellService.reportSell();    
	    	map.put("report", list);
	    		System.out.println("in reprotsell");
	    		//return "reportSell";
	    		return "JTTable";
	    	/*map.put("name", "libai");
	    	return "hello";*/
	    	
	    }
	
}
