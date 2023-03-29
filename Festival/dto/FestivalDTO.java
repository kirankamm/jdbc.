package com.xworkz.festival.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FestivalDTO {

	//ugadi  sweet cloths family_members gifts
	
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min=2,max=20)
	private String ugadi;
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min=2,max=20)
	private String sweet;
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min=2,max=20)
	private String cloths;
	
	private int family_members;
	private int gifts ;	
	
	
}
