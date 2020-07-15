package com.iiht.movie.service;

import java.util.List;

import com.iiht.movie.dto.AllotmentDTO;

public interface AllotmentService {

	public AllotmentDTO saveAllotment(AllotmentDTO allotment);
	
	public AllotmentDTO findByMovieName(String movieName);
	
	public AllotmentDTO findByMultiplexName(String multiplexName);
	
	public List<AllotmentDTO> findAll();
}
