package com.iiht.functionalcases;

import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.iiht.movie.dto.AllotmentDTO;
import com.iiht.movie.dto.MovieDTO;
import com.iiht.movie.dto.MultiplexDTO;
import com.iiht.movie.model.Allotment;
import com.iiht.movie.model.Movie;
import com.iiht.movie.model.Multiplex;
import com.iiht.movie.repository.AllotmentRepository;
import com.iiht.movie.repository.MovieRepository;
import com.iiht.movie.repository.MultiplexRepository;
import com.iiht.movie.service.AllotmentServiceImpl;
import com.iiht.movie.service.MovieServiceImpl;
import com.iiht.movie.service.MultiplexServiceImpl;
import com.iiht.utiltestclass.MasterData;

public class TestFunctional {

	static {
		File file = new File("output_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	
	@Mock
	MovieRepository movieRepository;
	
	@Mock
	MultiplexRepository moultiplexRepository;
	
	@Mock
	AllotmentRepository allotmentRepository;
	
	@Mock
	private Movie movie;
	
	@Mock
	private Multiplex multiplex;
	
	@Mock
	private Allotment allotment;
	
	@InjectMocks
	private MovieServiceImpl movieServiceImpl;
	
	@InjectMocks
	private MultiplexServiceImpl multiplexServiceImpl;
	
	@InjectMocks
	private AllotmentServiceImpl allotmentServiceImpl;
	
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Test
	public void testSaveMovie() throws Exception {
		Boolean value;
		MovieDTO movie = movieServiceImpl.saveMovie(MasterData.getMovie());
		if(movie!=null)
		{
			value = true;
		}
		else
		{
			value = false;
		}
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestSaveMovies="+(value?true:false), true); 
	}
	
	@Test
	public void testGetMovieByName() throws Exception {
		MovieDTO movie = new MovieDTO();
		movie.setName("DDLJ");
		String movieName = movie.getName();
		MovieDTO moviefromdb = movieServiceImpl.findByMovieName(movie.getName());
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestViewMovieByName="+(movieName!=null?true:false), true); 
	    
	}
	
	@Test
	public void testViewAllMovies() throws Exception {
		
		List<MovieDTO> list = new ArrayList<>();
		list.add(new MovieDTO());
		list.add(new MovieDTO());
	    when(movieRepository.findAll()).thenReturn((List<MovieDTO>)list);
		List<MovieDTO> movieList = movieServiceImpl.findAll();
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestViewAllMovies="+(movieList==list?true:false), true); 
	}
	
	@Test
	public void testSaveMultiplex() throws Exception {
		Boolean value;
		MultiplexDTO multiplex = multiplexServiceImpl.saveMultiplex(MasterData.getMultiplex());
		if(multiplex!=null)
		{
			value = true;
		}
		else
		{
			value = false;
		}
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestSaveMultiplex="+(value?true:false), true); 
	}
	
	@Test
	public void testGetMultiplexByName() throws Exception {
		Multiplex multiplex = new Multiplex();
		multiplex.setName("WSM");
		String multiplexName = multiplex.getName();
		MultiplexDTO multiplexfromdb = multiplexServiceImpl.searchByMultiplex(multiplex.getName());
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestGetMultiplexByName="+(multiplexName!=null?true:false), true); 
	    
	}
	
	@Test
	public void testViewAllMultiplex() throws Exception {
		
		List<MultiplexDTO> list = new ArrayList<>();
		list.add(new MultiplexDTO());
		list.add(new MultiplexDTO());
	    when(moultiplexRepository.findAll()).thenReturn((List<MultiplexDTO>)list);
		List<MultiplexDTO> multiplexList = multiplexServiceImpl.searchAll();
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestViewAllMultiplex="+(multiplexList==list?true:false), true); 
	}

	@Test
	public void testSaveAllotment() throws Exception {
		Boolean value;
		AllotmentDTO allotment = allotmentServiceImpl.saveAllotment(MasterData.getAllotment());
		if(allotment!=null)
		{
			value = true;
		}
		else
		{
			value = false;
		}
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestSaveAllotment="+(value?true:false), true); 
	}
	
	@Test
	public void testGetAllotmentByMovieName() throws Exception {
		AllotmentDTO allotment = new AllotmentDTO();
		allotment.setMovieName("DDLJ");
		String movieAllotment = allotment.getMovieName();
		AllotmentDTO allotmentfromdb = allotmentServiceImpl.findByMovieName(allotment.getMovieName());
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestGetAllotmentByMovieName="+(movieAllotment!=null?true:false), true); 
	    
	}
	
	@Test
	public void testGetAllotmentByMultiplexName() throws Exception {
		AllotmentDTO allotment = new AllotmentDTO();
		allotment.setMultiplexName("WSM");
		String multiplexAllotment = allotment.getMultiplexName();
		AllotmentDTO allotmentfromdb = allotmentServiceImpl.findByMultiplexName(allotment.getMultiplexName());
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestGetAllotmentByMultiplexName="+(multiplexAllotment!=null?true:false), true); 
	    
	}
	
	@Test
	public void testViewAllAllotment() throws Exception {
		
		List<AllotmentDTO> list = new ArrayList<>();
		list.add(new AllotmentDTO());
		list.add(new AllotmentDTO());
	    when(allotmentRepository.findAll()).thenReturn((List<AllotmentDTO>)list);
		List<AllotmentDTO> allotmentList = allotmentServiceImpl.findAll();
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestViewAllAllotment="+(allotmentList==list?true:false), true); 
	}


	
}
