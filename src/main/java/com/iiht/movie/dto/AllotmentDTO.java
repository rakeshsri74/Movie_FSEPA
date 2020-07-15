package com.iiht.movie.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@SuppressWarnings("deprecation")
@Data
public class AllotmentDTO {

	private long allotmentId;
	
	@Length(min = 5, max = 30)
	@NotNull
	private String movieName;
	
	@Length(min = 5, max = 30)
	@NotNull
	private String multiplexName;
	
	@Length(min = 5, max = 30)
	@NotNull
	private String city;
	
	@Length(min = 5, max = 30)
	@NotNull
	private String state;

}
