package com.iiht.movie.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@SuppressWarnings("deprecation")
@Data
public class MultiplexDTO {

	private long multiplexId;
	
	@Length(min = 5, max = 30)
	@NotNull
	private String name;
	
	@Length(min = 5, max = 30)
	@NotNull
	private String city;
	
	@Length(min = 5, max = 30)
	@NotNull
	private String state;

}
