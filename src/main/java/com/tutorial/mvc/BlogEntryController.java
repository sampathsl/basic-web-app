package com.tutorial.mvc;

import com.tutorial.entity.BlogEntry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sampath on 9/22/2015.
 */
@Controller
public class BlogEntryController {

    /*@Autowired
    BlogEntry blogEntry;*/
	
	private BlogEntry blogEntry = null;

	@Autowired
	public BlogEntryController(BlogEntry blogEntry) {
		this.blogEntry = blogEntry;
	}

   @RequestMapping("/test")
    public String showViewJSP(){
        return "view";
    }

   @RequestMapping("/blog-entry")
    public ResponseEntity<Object> showResponseEntity(){
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setTitle("Test Blog Entry");
        return new ResponseEntity<Object>(blogEntry,HttpStatus.OK);
    }
   
   @RequestMapping(value = "/todos", method = RequestMethod.GET)
	public ModelAndView hello() {

		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		blogEntry.setTitle("TITLE - INDEX WORK");
		model.addObject("title",blogEntry.getTitle());
		
		return model;
	}

}
