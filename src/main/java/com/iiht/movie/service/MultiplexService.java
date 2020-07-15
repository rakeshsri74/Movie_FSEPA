package com.iiht.movie.service;

import java.util.List;

import com.iiht.movie.dto.MultiplexDTO;

public interface MultiplexService {

	public MultiplexDTO saveMultiplex(MultiplexDTO multiplex);
	
	MultiplexDTO searchByMultiplex(String name);
	
	List<MultiplexDTO> searchAll();
}
