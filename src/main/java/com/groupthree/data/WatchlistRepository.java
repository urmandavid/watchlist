package com.groupthree.data;

import com.groupthree.domain.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchlistRepository extends JpaRepository<Watchlist, Integer> {

    @Query(value = "SELECT w FROM Watchlist w WHERE w.title IN :title")
    Watchlist findWatchlistByTitle(@Param("title") String title);

    Boolean existsWatchlistByTitle(String title);

}
