package com.xworkz.shopping.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ShoppingDTO {
	//no_of_shop     people   wacth_shop  mall_owner_name     worker_name
	
	
	
	
	private int no_of_shop;
	private int people;
	private int wacth_shop;
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min=2,max=20)
	private String mall_owner_name;
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min=2,max=20)
	private String worker_name ;	
	
}
