/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrator
 */
@Controller
public class SimpleController  {
    
   @RequestMapping(value="/simple")
    
    public ModelAndView helloWorld() {
       ModelAndView mav= new ModelAndView("simple", "message", "Hello From MVC");
       return  mav;
    }
}
