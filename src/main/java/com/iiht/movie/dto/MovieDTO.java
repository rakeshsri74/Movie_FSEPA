package com.iiht.movie.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@SuppressWarnings("deprecation")
@Data
public class MovieDTO {

	private long movieId;
	
	@Length(min = 5, max = 30)
	@NotNull
	private String name;
	
	@Length(min = 5, max = 30)
	@NotNull
	private String directedBy;
	
	@Length(min = 5, max = 30)
	@NotNull
	private String producedBy;
	
	@Length(min = 5, max = 30)
	@NotNull
	private String production;
	
	private String releasedDate;
}
