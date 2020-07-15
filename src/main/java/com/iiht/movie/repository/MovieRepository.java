package com.iiht.movie.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iiht.movie.dto.MovieDTO;

@Repository
public interface MovieRepository extends MongoRepository<MovieDTO,Long> {
	
	public MovieDTO save(MovieDTO movie);
	public List<MovieDTO> findAll();
	public MovieDTO findByName(String name);
}
