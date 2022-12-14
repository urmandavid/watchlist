package com.groupthree.controller;

import com.groupthree.data.MovieRepository;
import com.groupthree.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("movies")
public class MovieController {

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
