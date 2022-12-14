package com.groupthree.domain;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @Schema(description = "Title")
    //@Column(name = "title")
    private String title;

    @Schema(description = "Release Year")
    //@Column(name = "release_year")
    private int releaseYear;
    @Schema(description = "Genre")
    //@Column(name = "genre")
    private String genre;
    @Schema(description = "Director")
    //@Column(name = "director")
    private String director;
    @Schema(description = "Actors")
    //@Column(name = "actor")
    private String actors;
    @Schema(description = "Description")
    //@Column(name = "description")
    private String description;
    @Schema(description = "Rating")
    //@Column(name = "rating")
    private double rating;
    /*    @Schema(description = "Priority")
        //@Column(name = "prio")
        private int priority;*/
    @Schema(description = "Watched")
    //@Column(name = "watched")
    private Boolean watched = false;

    public Movie() {}

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public Movie(String title, int releaseYear, String genre, String director, String actors, String description, double rating, Boolean watched) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.description = description;
        this.rating = rating;
        //.priority = priority;
        this.watched = watched;
    }

    public Movie(int id, String title, int releaseYear, String genre, String director, String actors, String description, double rating, int priority, Boolean watched) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.description = description;
        this.rating = rating;
        //this.priority = priority;
        this.watched = watched;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Boolean getWatched() {
        return watched;
    }

    public void setWatched(Boolean watched) {
        this.watched = watched;
    }
}
