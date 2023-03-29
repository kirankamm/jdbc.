package com.xworkz.cricket.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidatorFactory;
import com.mysql.cj.xdevapi.Schema.Validation;
import com.xworkz.cricket.app.dto.CricketDTO;
import com.xworkz.cricket.app.repository.CricketRepository;

public class CricketServiceIMPL implements CricketService {

	
	CricketRepository cricketRepository;
	
	public CricketServiceIMPL() {
	  System.out.println("CricketServiceIMPL");
	}
	
	public CricketServiceIMPL(CricketRepository cricketRepository) {
		this.cricketRepository=cricketRepository;
		}
	
	
	/*
	 * validate==kayam golisu or correct
	 */	 	 

	
	@Override    //Unemployment method
	public boolean validateAndSave(CricketDTO dto) {
		// TODO Auto-generated method stub
		
		if(dto !=null) {
			ValidatorFactory factory=javax.validation.Validation.buildDefaultValidatorFactory();
			javax.validation.Validator valid=factory.getValidator();
			Set<ConstraintViolation<CricketDTO>> violationMessages=valid.validate(dto);
			
			if(violationMessages.isEmpty()) {
				boolean Save= this.cricketRepository.onSave(dto);
				System.out.println(Save);
			}
			else {
				
				System.out.println(violationMessages.toString());
			} 
			
		}
		else{
			System.out.println("DTO is null");
		}
		return true;
	
			}
	}
