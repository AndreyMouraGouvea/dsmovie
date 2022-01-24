package com.amg.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amg.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	
}
