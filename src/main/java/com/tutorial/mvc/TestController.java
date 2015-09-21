package com.tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sampath on 9/22/2015.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String showViewJSP(){
        return "view";
    }

}
