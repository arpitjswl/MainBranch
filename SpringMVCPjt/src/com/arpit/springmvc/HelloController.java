package com.arpit.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class HelloController {

	/*
	 * @RequestMapping("/welcomeArpit/{user}") protected ModelAndView
	 * handleRequestInternal(@PathVariable("user") String name) throws Exception {
	 * ModelAndView model = new ModelAndView("HelloPage"); model.addObject("wlocome"
	 * , "Hello "+name);
	 * 
	 * // TODO Auto-generated method stub return model; }
	 */

	@RequestMapping(value = "/admission.html", method = RequestMethod.GET)
	public ModelAndView getAdmissonForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value = "/submitAdmission.html", method = RequestMethod.POST)
	/*public ModelAndView submitAdmissonForm(@RequestParam(value = "studname", defaultValue = "DUMMY") String name , @RequestParam("studhobby") String hobby)*/ 
		public ModelAndView submitAdmissonForm(@Valid @ModelAttribute("student12") Student student1, BindingResult result)
	{
		
		if ( result.hasErrors() ) {
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		
		ModelAndView model = new ModelAndView("AdmissionFormSuccess");
		model.addObject("Studen details is : ");
		//model.addObject("msg", "Details submitted by you is : " +name +hobby);
		
		return model;
	}
	
	@ModelAttribute
	public void addingCommonObjets(Model model) {
		model.addAttribute("defaul", "College of Engineering Nagpur");
	}
}
