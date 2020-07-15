package com.iiht.movie.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iiht.movie.dto.AllotmentDTO;

@Repository
public interface AllotmentRepository extends MongoRepository<AllotmentDTO,Long> {

	public AllotmentDTO save(AllotmentDTO allotment);
	
	public AllotmentDTO findByMovieName(String movieName);
	
	public AllotmentDTO findByMultiplexName(String multiplexName);
	
	public List<AllotmentDTO> findAll();
}
