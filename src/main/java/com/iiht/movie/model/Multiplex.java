package com.iiht.movie.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "multiplexmaster")
@Data
public class Multiplex {

	@Id
	private long multiplexId;
	
	private String name;
	
	private String city;
	
	private String state;

		
}
