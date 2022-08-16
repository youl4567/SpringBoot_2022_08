package com.callor.data.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //  @RequestMapping(value={"","/"}, RequestMethod=GET)
    @GetMapping(value = {"", "/"})
    public String home () {
      return "home";
    }
}
