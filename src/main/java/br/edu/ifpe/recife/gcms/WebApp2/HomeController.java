package br.edu.ifpe.recife.gcms.WebApp2;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
 
@Controller 
public class HomeController { 
 
  @RequestMapping("/") 
  public @ResponseBody String greeting() { 
    return "Hello, Gradle"; 
  } 
  
  @RequestMapping("/fulano") 
  public @ResponseBody String greetingFulano() { 
    return "Hello, Fulano!!"; 
  } 
}  
