package com.groupthree.controller;

import com.groupthree.data.MovieRepository;
import com.groupthree.data.WatchlistRepository;
import com.groupthree.domain.Movie;
import com.groupthree.domain.Watchlist;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("watchlist")
public class WatchlistController {

    @Autowired
    private WatchlistRepository watchlistRepository;

    @Autowired
    private MovieRepository movieRepository;

    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successfully created watchlist",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Watchlist.class))),
            @ApiResponse(responseCode = "500", description = "Illegal to create watchlist with existing title", content = @Content)})
    @PostMapping(value = "createWatchlist")
    @ResponseStatus(HttpStatus.CREATED)
    public Watchlist createWatchlist(@RequestParam String title) {
        Watchlist watchlist = new Watchlist(title);
        if (watchlistRepository.existsWatchlistByTitle(watchlist.getTitle())) {
            throw new IllegalArgumentException("Illegal to create watchlist with existing title");
        }
        return this.watchlistRepository.save(watchlist);
    }

    @GetMapping("getAllWatchlists")
    public List<Watchlist> getAllWatchlist() {
        return this.watchlistRepository.findAll();
    }

    @GetMapping("getWatchlistById")
    public List<Movie> getWatchlistById(@RequestParam int id) {
        return this.watchlistRepository.findById(id).get().getMovies();
    }

    @GetMapping("getWatchlistByTitle")
    public Watchlist getWatchlistById(@RequestParam String title) {
        return this.watchlistRepository.findWatchlistByTitle(title);
    }

    @PutMapping("addMovieToWatchlist")
    public void addMovieToWatchlist(@RequestParam int watchlistId, String title) {
        Watchlist watchlist = watchlistRepository.findById(watchlistId).get();
        Movie movie = movieRepository.findMovieByTitle(title);

        watchlist.addMovie(movie);

        this.watchlistRepository.save(watchlist);
    }
}
