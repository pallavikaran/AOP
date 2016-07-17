/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Administrator
 */
@Controller
public class SimpleController  {
    
     @RequestMapping(value="/simple", method= RequestMethod.GET) 
    public ModelAndView helloWorld()
           {
               Computer c= new Computer();
               c.setSpeed(2000);
               c.setType("Sony");
       //ModelAndView mav= new ModelAndView("simple", "message","Hellow Spring MVC");
               ModelAndView mav= new ModelAndView("simple", "message",c);
       return mav;
    }
     @RequestMapping(value="/simple", method= RequestMethod.POST) 
    public ModelAndView helloWorld123()
           {
       ModelAndView mav= new ModelAndView("simple", "message","Hellow From Post Method");
       return mav;
    }
     
     
}
