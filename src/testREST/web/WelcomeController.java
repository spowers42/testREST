package testREST.web;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Controller
public class WelcomeController{
	private String message="hello";
	protected final Log logger= LogFactory.getLog(getClass());
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView getMessage (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		logger.info("Returning view");
		return new ModelAndView("test", "message", message);
	}
	
	@RequestMapping(value="/hello/{message}", method=RequestMethod.GET)
	public ModelAndView setMessage (@PathVariable("message") String message){
		logger.info("Setting Message to " + message);
		this.message=message;
		return new ModelAndView("empty");
	}
	
	@RequestMapping(value="/alt", method=RequestMethod.GET)
	@ResponseBody
	public String returnAlt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		return new String("<greeting>"+this.message+"</greeting>");
	}
}

