package com.amg.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amg.dsmovie.entities.Score;
import com.amg.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

	
}
