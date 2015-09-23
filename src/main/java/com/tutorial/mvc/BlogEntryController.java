package com.tutorial.mvc;

import com.tutorial.entity.BlogEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sampath on 9/22/2015.
 */
@Controller
public class BlogEntryController {

    /*@Autowired
    BlogEntry blogEntry;*/

    @RequestMapping("/test1")
    public String showViewJSP(){
        return "view";
    }

    @RequestMapping("/test")
    public ResponseEntity<Object> showResponseEntity(){
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setTitle("Test Blog Entry");
        return new ResponseEntity<Object>(blogEntry,HttpStatus.OK);
    }

}
