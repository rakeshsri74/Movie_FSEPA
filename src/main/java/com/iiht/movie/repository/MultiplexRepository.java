package com.iiht.movie.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iiht.movie.dto.MultiplexDTO;

@Repository
public interface MultiplexRepository extends MongoRepository<MultiplexDTO,Long> {

	public MultiplexDTO save(MultiplexDTO multiplex);
	
	MultiplexDTO findByName(String name);
	
	List<MultiplexDTO> findAll();
	
}
