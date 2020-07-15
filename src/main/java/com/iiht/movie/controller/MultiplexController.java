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

import com.iiht.movie.dto.MultiplexDTO;
import com.iiht.movie.service.MultiplexService;

@RestController
@RequestMapping("/multiplex")
public class MultiplexController {
	
	@Autowired
    private MultiplexService multiplexService;
	
	@GetMapping(value = "/")
    public List<MultiplexDTO> getAllMultiplex() {
        return multiplexService.searchAll();
    }
	
	@GetMapping(value = "/{name}")
    public MultiplexDTO getMultiplexByName(@PathVariable("name") String name) {
        return multiplexService.searchByMultiplex(name);
    }
	
	@PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateMultiplex(@RequestBody MultiplexDTO multiplex) {
		
		multiplexService.saveMultiplex(multiplex);
		
        return new ResponseEntity("Multiplex added successfully", HttpStatus.OK);
    
	
	}


}
