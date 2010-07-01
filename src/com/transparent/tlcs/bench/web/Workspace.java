package com.transparent.tlcs.bench.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/workspace")
public class Workspace {
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView makeWorkspace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setHeader("server", "TLCS-UR/FAKE Spring");
		response.setHeader("X-TLCS-ELAPSED", "1");
		response.setHeader("Location", "somewhere");
		response.setStatus(201);
		
		return new ModelAndView("test");
	}
	
	@RequestMapping(value="{name}", method=RequestMethod.DELETE)
	public ModelAndView deleteWorkspace(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		response.setHeader("server", "TLCS-UR/FAKE Spring");
		response.setHeader("X-TLCS-ELAPSED", "1");
		response.setHeader("Location", "somewhere");
		response.setStatus(200);
		
		return new ModelAndView("empty");
	}
	
	//@RequestMapping(value="{name}/{project}/meta" )
}
