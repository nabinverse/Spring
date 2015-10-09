package com.nabin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/hello")
public class HelloController{
 
   @RequestMapping(method = RequestMethod.GET)
   public ModelAndView printHello(@ModelAttribute("mymodel") MyBean model) {
      model.setName("nabin");
      ModelAndView mv = new ModelAndView("hello");
      mv.addObject("modelUI", model);
      return mv;
   }
   
   @ModelAttribute("mymodel")
   public MyBean getBean(){
	   return new MyBean();
   }

}
