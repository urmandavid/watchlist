package com.groupthree.controller;

import com.groupthree.data.MovieRepository;
import com.groupthree.domain.Movie;
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
    private MovieRepository data;

    @RequestMapping(value="/list.html", method=RequestMethod.GET)
    public ModelAndView movies(){
        List<Movie> allMovies = data.findAll();
        return new ModelAndView("allMovies" , "Movies",
                allMovies);
    }

    @RequestMapping(value="/movie/{title}")
    public ModelAndView showMovieByTitle(@PathVariable("title") String title) {
        Movie movie = data.findByTitle(title);
        return new ModelAndView("movieInfo", "movie", movie);
    }
}
