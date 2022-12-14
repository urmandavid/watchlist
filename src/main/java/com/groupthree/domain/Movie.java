package com.groupthree.domain;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @Schema(description = "Title")
    private String title;

    @Schema(description = "year")
    private int year;

    @Schema(description = "Genre")
    private String genre;

    @Schema(description = "Director")
    private String director;

    @Schema(description = "Actors")
    private String actors;

    @Schema(description = "Description")
    private String description;

    @Schema(description = "Rating")
    private double rating;


    public Movie() {}

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public Movie(String title, int year, String genre, String director, String actors, String description, double rating) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.description = description;
        this.rating = rating;
    }

    public Movie(int id, String title, int year, String genre, String director, String actors, String description, double rating) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.description = description;
        this.rating = rating;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

}
