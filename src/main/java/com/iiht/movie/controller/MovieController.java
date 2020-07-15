package com.iiht.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.movie.dto.MovieDTO;
import com.iiht.movie.model.Movie;
import com.iiht.movie.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
    private MovieService movieService;

	@GetMapping(value = "/")
    public List<MovieDTO> getAllMovies() {
        return movieService.findAll();
    }
	
	@GetMapping(value = "/{name}")
    public MovieDTO getMovieByName(@PathVariable("name") String name) {
        return movieService.findByMovieName(name);
    }
	
	@PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateMovie(@RequestBody MovieDTO movie) {
		
		//Code to save movie here
		movieService.saveMovie(movie);
		return new ResponseEntity("Movie added successfully", HttpStatus.OK);
    	
	}
	
}
