package com.xworkz.wedding.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeddingDTO {

	
	private int peoples; 
	private int mens; 
	private int womens;
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min=2,max=45)
	private String location; 
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min=2,max=45)
	private String sweet_name;
}
