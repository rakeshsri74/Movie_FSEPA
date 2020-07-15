package com.iiht.movie.service;

import java.util.List;

import com.iiht.movie.dto.MovieDTO;
import com.iiht.movie.model.Movie;

public interface MovieService {

	public MovieDTO saveMovie(MovieDTO movie);
	List<MovieDTO> findAll();
	MovieDTO findByMovieName(String name);
}
