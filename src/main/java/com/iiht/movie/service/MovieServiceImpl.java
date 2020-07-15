package com.iiht.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.movie.dto.MovieDTO;
import com.iiht.movie.model.Movie;
import com.iiht.movie.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
    private MovieRepository movieRepository;
	
	@Override
	public MovieDTO saveMovie(MovieDTO movie) {
		return movieRepository.save(movie);
	}

	@Override
	public MovieDTO findByMovieName(String name) {
		return movieRepository.findByName(name);
	}

	@Override
	public List<MovieDTO> findAll() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

}
