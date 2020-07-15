package com.iiht.movie.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "movieallotment")
@Data
public class Allotment {
	
	@Id
	private long allotmentId;
	
	private String movieName;
	
	private String multiplexName;
	
	private String city;
	
	private String state;

}
