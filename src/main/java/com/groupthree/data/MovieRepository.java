package com.groupthree.data;

import org.springframework.data.jpa.repository.JpaRepository;
import com.groupthree.domain.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository <Movie, Integer> {
    public Movie findByTitle(String title);

    @Query(value = "SELECT DISTINCT m FROM Movie m WHERE m.title IN :title")
    Movie findMovieByTitle(@Param("title") String title);
}
