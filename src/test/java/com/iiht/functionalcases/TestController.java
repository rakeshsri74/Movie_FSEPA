package com.iiht.functionalcases;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iiht.movie.controller.AllotmentController;
import com.iiht.movie.controller.MovieController;
import com.iiht.movie.controller.MultiplexController;
import com.iiht.movie.service.AllotmentService;
import com.iiht.movie.service.MovieService;
import com.iiht.movie.service.MultiplexService;
import com.iiht.utiltestclass.MasterData;

public class TestController {

	@Mock
	private MovieService movieService;
	
	@Mock
	private MultiplexService multiplexService;
	
	@Mock
	private AllotmentService allotmentService;
	
	@InjectMocks
	private MovieController movieController;
	
	@InjectMocks
	private MultiplexController multiplexController;
	
	@InjectMocks
	private AllotmentController allotmentController;
	
	private MockMvc mockMvc;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(movieController, multiplexController,allotmentController).build();
	}
	
	@Test
	public void testSaveMovie() throws Exception {
		this.mockMvc
				.perform(post("/save").content(asJsonString(MasterData.getMovie()))
						.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isCreated()).andExpect(MockMvcResultMatchers.jsonPath("$.movieId").exists());
	}
	
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	public void testGetMovieByName() throws Exception {
		this.mockMvc.perform(get("/movie/{name}", 1).accept(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isOk());
	}
	@Test
	public void getMovieList() throws Exception {
		this.mockMvc.perform(get("/movie/")
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk());				
	}

	@Test
	public void testSaveMultiplex() throws Exception {
		this.mockMvc
				.perform(post("/save").content(asJsonString(MasterData.getMovie()))
						.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isCreated()).andExpect(MockMvcResultMatchers.jsonPath("$.multiplexId").exists());
	}
	@Test
	public void testGetMultiplexByName() throws Exception {
		this.mockMvc.perform(get("/multiplex/{name}", 1).accept(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isOk());
	}
	@Test
	public void getMultiplexList() throws Exception {
		this.mockMvc.perform(get("/multiplex/")
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk());				
	}
	
	@Test
	public void testSaveAllotment() throws Exception {
		this.mockMvc
				.perform(post("/save").content(asJsonString(MasterData.getMovie()))
						.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isCreated()).andExpect(MockMvcResultMatchers.jsonPath("$.allotmentId").exists());
	}
	@Test
	public void testGetAllotmentByMovieName() throws Exception {
		this.mockMvc.perform(get("/findByMovie/{movieName}", 1).accept(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isOk());
	}
	
	@Test
	public void testGetAllotmentByMultiplexName() throws Exception {
		this.mockMvc.perform(get("/findByMultiplex/{multiplexName}", 1).accept(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isOk());
	}
	
	@Test
	public void getAllotmentList() throws Exception {
		this.mockMvc.perform(get("/allot/")
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk());				
	}
	
}
