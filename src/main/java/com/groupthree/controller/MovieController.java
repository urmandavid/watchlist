package com.groupthree.controller;

import com.groupthree.data.MovieRepository;
import com.groupthree.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/website/movies")
public class MovieController {

/*    @Autowired
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
    }*/

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie createMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @GetMapping("/getAll")
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    @GetMapping("/GetById")
    public Optional<Movie> getMovieById(int id) {
        return movieRepository.findById(id);
    }

    @GetMapping("/GetByTitle")
    public Movie getMovieByTitle(String title) {
        return movieRepository.findMovieByTitle(title);
    }

}
