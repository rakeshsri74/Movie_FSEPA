package com.iiht.utiltestclass;

import com.iiht.movie.dto.AllotmentDTO;
import com.iiht.movie.dto.MovieDTO;
import com.iiht.movie.dto.MultiplexDTO;
import com.iiht.movie.model.Allotment;
import com.iiht.movie.model.Movie;
import com.iiht.movie.model.Multiplex;

public class MasterData {

	public static MovieDTO getMovie() {
		
		MovieDTO movie = new MovieDTO();
		
		movie.setMovieId(1);
		movie.setName("DDLJ");
		movie.setDirectedBy("Karan Johar");
		movie.setProducedBy("A.K");
		movie.setProduction("Dharma");
		movie.setReleasedDate("12/12/90");
		
		return movie;
	}
	
	public static MultiplexDTO getMultiplex() {
		
		MultiplexDTO multiplex = new MultiplexDTO();
		
		multiplex.setMultiplexId(1);
		multiplex.setName("WSM");
		multiplex.setCity("Ghaziabad");
		multiplex.setState("UP");
		
		return multiplex;
	}
	
	public static AllotmentDTO getAllotment()
	{
		AllotmentDTO allotment = new AllotmentDTO();
		
		allotment.setAllotmentId(1);
		allotment.setMovieName("DDLJ");
		allotment.setMultiplexName("WSM");
		allotment.setCity("Ghaziabad");
		allotment.setState("UP");
		
		return allotment;
	}
}
