package com.groupthree.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    private int id;
    private int year;
    private String title;
    private String genre;
    private String director;

    public Movie () {}

    public String toString() {
        return this.title + " Director: " + this.director;
    }
}
