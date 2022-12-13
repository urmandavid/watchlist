package com.groupthree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/website/movies")
public class MovieController {

    @Autowired
    //private MovieRepository data;

    //Responsible for listing the movies
    @RequestMapping(value="/list.html", method= RequestMethod.GET)
    public ModelAndView movies() {
        // TODO
        return null;
    }

    //Search for a movie by its title
    @RequestMapping(value="/movies/{title}")
    public ModelAndView showMovieByTitle(@PathVariable("title") String title) {
        // TODO
        return null;
    }
}
