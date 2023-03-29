package com.xworkz.wedding.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.wedding.app.dto.WeddingDTO;
import com.xworkz.wedding.app.repository.WeddingRepository;

public class WeddingServiceIMPL implements WeddingService{

	
	WeddingRepository weddingRepository;
	
	
	public WeddingServiceIMPL() {
	System.out.println("WeddingServiceIMPL");
	
	}
	

	public WeddingServiceIMPL(WeddingRepository weddingRepository) {
	this.weddingRepository=weddingRepository;	
	}
	
	@Override
	public boolean ValideAndSave(WeddingDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("inside validateAndSave method");
	if (dto !=null) {
		
		ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
		
		Validator validator=validatorFactory.getValidator();
		
		Set<ConstraintViolation<WeddingDTO>> constraintViolation =validator.validate(dto);
		
		if (constraintViolation.isEmpty()) {
			boolean save=this.weddingRepository.onSave(dto);
			System.out.println(save);
	
		} else {
			System.out.println(constraintViolation.toString());
		
		}
		
	} else {

		
		System.out.println("dto is empty.....");
	}
			
		return true;
	}

	
	@Override
	public boolean updateDTO(int peoples) {
		// TODO Auto-generated method stub
   //defend datatype
		if (peoples!=0) {
			System.out.println("you can update the data");
			boolean update=this.weddingRepository.onUpdate(peoples);
			System.out.println(update);
		
			
		} else {

		System.out.println("not updated");	
		}
		return true;
	}


	@Override
	public boolean read() {
		// TODO Auto-generated method stub
		
		boolean readd=this.weddingRepository.onRead();
		return true;
	}

}
