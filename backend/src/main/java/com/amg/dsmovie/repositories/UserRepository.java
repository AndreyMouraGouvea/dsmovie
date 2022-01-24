package com.amg.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amg.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
