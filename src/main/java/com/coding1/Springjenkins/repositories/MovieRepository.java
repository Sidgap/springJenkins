package com.coding1.Springjenkins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coding1.Springjenkins.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	List<Movie> findByGenera(String genera);

}
