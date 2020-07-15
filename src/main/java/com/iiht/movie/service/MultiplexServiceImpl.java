package com.iiht.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.movie.dto.MultiplexDTO;
import com.iiht.movie.model.Multiplex;
import com.iiht.movie.repository.MultiplexRepository;

@Service
public class MultiplexServiceImpl implements MultiplexService {

	
	@Autowired
    private MultiplexRepository multiplexRepository;
	
	@Override
	public MultiplexDTO saveMultiplex(MultiplexDTO multiplex) {
		return multiplexRepository.save(multiplex);
	}

	@Override
	public MultiplexDTO searchByMultiplex(String name) {
		// TODO Auto-generated method stub
		return multiplexRepository.findByName(name);
	}

	@Override
	public List<MultiplexDTO> searchAll() {
		// TODO Auto-generated method stub
		return multiplexRepository.findAll();
	}

}
