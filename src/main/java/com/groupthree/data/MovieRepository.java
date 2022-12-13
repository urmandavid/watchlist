package com.groupthree.data;

import org.springframework.data.jpa.repository.JpaRepository;
import com.groupthree.domain.Movie;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository <Movie, Integer> {
    public Movie findByTitle(String title);
}
