package com.xworkz.cricket.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@AllArgsConstructor

public class CricketDTO {



	private int id;
	private int teams;
	private int players;
	@NotBlank
    @NotEmpty
	@NotNull
	@Size(min=2,max=16)
	private String fev_team;
	@NotBlank
    @NotEmpty
	@NotNull
	@Size(min=2,max=16)
	private String fev_flayer;
	private int start_month;
	private int end_month;
	private String fev_ground;

	
}


