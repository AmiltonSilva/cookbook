package pt.ulht.es.cookbook.controller;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
  
	/**
     *
     * @param model
     * @return
     */
    @RequestMapping(method=RequestMethod.GET, value="/")
	public String showHome(Model model) {

	    
		return "home";
	}

}