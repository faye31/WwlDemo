/**
 * File Name: WwlController.java
 * Project Name: WwlDemo
 * Author: faye31
 * Create Date: 2018年12月6日 下午8:48:13
 * Copyright (c) 2018, All Rights Reserved. 
**/

package com.wwl.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WwlController {

	@RequestMapping(value="/sample/{apitag}",method=RequestMethod.GET)
	public String nextpage(@PathVariable("apitag") String apitag, Model model ) {
		
		model.addAttribute("name","Tom");
		model.addAttribute("year","13");
		
		return apitag;
	}
}
