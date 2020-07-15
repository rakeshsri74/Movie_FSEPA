package com.iiht.movie.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "moviemaster")
@Data
public class Movie {

	@Id
	private long movieId;
	
	private String name;
	
	private String directedBy;
	
	private String producedBy;
	
	private String production;
	
	private String releasedDate;
	
		
	
}
