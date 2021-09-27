package com.m12873714_4045;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handle the /start endpoint
 * @return
 *
 */
@Controller
public class M12873714Controller {
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String start() {
		
		return "start";
	}
	
	@PostMapping("start")
	public String create() {
		
		return "start";
	}
	
	/**
	 * Handle the endpoint
	 * @return
	 *
	 */
	
	@RequestMapping("/")
	public String index() {
		
		return "start";
	}
	
	
}
