package com.groupthree.domain;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "watchlists")
public class Watchlist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int watchlistId;

    @Schema(description = "Title")
    private String title;

    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Movie> movies = new ArrayList<>();

    public Watchlist() {
    }

    public Watchlist(String title) {
        this.title = title;
    }

    public Watchlist(int watchlistId, String title) {
        this.watchlistId = watchlistId;
        this.title = title;
    }

    public int getWatchlistId() {
        return watchlistId;
    }

    public void setWatchlistId(int watchlistId) {
        this.watchlistId = watchlistId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
