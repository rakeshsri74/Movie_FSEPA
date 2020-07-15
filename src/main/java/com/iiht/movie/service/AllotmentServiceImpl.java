package com.iiht.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.movie.dto.AllotmentDTO;
import com.iiht.movie.model.Allotment;
import com.iiht.movie.repository.AllotmentRepository;

@Service
public class AllotmentServiceImpl implements AllotmentService {

	@Autowired
    private AllotmentRepository allotmentRepository;
	
	@Override
	public AllotmentDTO saveAllotment(AllotmentDTO allotment) {
		// TODO Auto-generated method stub
		return allotmentRepository.save(allotment);
	}

	@Override
	public AllotmentDTO findByMovieName(String movieName) {
		// TODO Auto-generated method stub
		return allotmentRepository.findByMovieName(movieName);
	}

	@Override
	public AllotmentDTO findByMultiplexName(String multiplexName) {
		// TODO Auto-generated method stub
		return allotmentRepository.findByMultiplexName(multiplexName);
	}

	@Override
	public List<AllotmentDTO> findAll() {
		// TODO Auto-generated method stub
		return allotmentRepository.findAll();
	}

}
