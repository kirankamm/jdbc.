package com.xworkz.birthdays.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BirthdayDTO {


	//mens   womens    cake_name     name_candel     cake_price
	private int mens; 
	private int womens;
	
	@NotEmpty
	@NotNull
	@NotBlank
	@Size(min=2,max=10)
	private String  cake_name;
	@NotEmpty
	@NotNull
	@NotBlank
	@Size(min=2,max=10)
	private String name_candel;
	private int cake_price;
	
	
	
}
