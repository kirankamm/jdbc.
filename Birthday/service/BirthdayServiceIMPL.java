package com.xworkz.birthdays.app.service;



import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.mysql.cj.xdevapi.Schema.Validation;
import com.xworkz.birthdays.app.dto.BirthdayDTO;
import com.xworkz.birthdays.app.repository.BirthdayRepository;
//import com.xworkz.festival.app.dto.FestivalDTO;

public class BirthdayServiceIMPL implements BirthdayService{

	BirthdayRepository birthdayRepository;
	
	public  BirthdayServiceIMPL() {
		System.out.println(" default constrater BirthdayServiceIMPL");
	}
	
	
	
	public  BirthdayServiceIMPL(BirthdayRepository birthdayRepository) {
		this.birthdayRepository =birthdayRepository;
	}
	
	
	
	@Override
	public boolean ValideAndSave(BirthdayDTO dto) {
		// TODO Auto-generated method stub
		
		System.out.println("inside the validate and save");
		if (dto !=null) {
			ValidatorFactory validatorFactory=javax.validation.Validation.buildDefaultValidatorFactory();
			Validator validator=validatorFactory.getValidator();
			
			Set<ConstraintViolation<BirthdayDTO>>  constraintViolations=validator.validate(dto);
			
		if (constraintViolations.isEmpty()) {
			boolean save=this.birthdayRepository.onSave(dto);
			System.out.println(save);
		
			
		} else {
			
			System.out.println(constraintViolations.toString());
		
		}
		}else {
			System.out.println("dto is empty ");
		}
		return true;
		}
			

	
	@Override
	public boolean UpdateDTO(int cake_price) {
		// TODO Auto-generated method stub
	
		if (cake_price !=0) {
			System.out.println("you can update data");
			boolean update=this.birthdayRepository.onUpdate(cake_price);
			System.out.println(update);
		} else {
   
			System.out.println("con not update");
		}
		return true;
		}



	@Override
	public boolean read() {
		// TODO Auto-generated method stub
		
		boolean read=this.birthdayRepository.onRead();
		return true;
	}



	@Override
	public boolean UpdateDTO1(int mens) {
		// TODO Auto-generated method stub
		if (mens !=0) {
			System.out.println("you can update data");
			boolean update=this.birthdayRepository.onUpdate(mens);
			System.out.println(update);
		} else {
   
			System.out.println("con not update");
		}
		return true;
		}



	@Override
	public boolean UpdateDTO2(int womens) {
		// TODO Auto-generated method stub
		if (womens !=0) {
			System.out.println("you can update data");
			boolean update=this.birthdayRepository.onUpdate(womens);
			System.out.println(update);
		} else {
   
			System.out.println("can not update");
		}
		return true;
		}



	@Override
	public boolean Delete(int womens) {
		// TODO Auto-generated method stub
		if (womens !=0) {
			System.out.println("you can delete data");
			boolean delete=this.birthdayRepository.onDelete(womens);
			System.out.println(delete);
		} else {
   
			System.out.println("can not delete");
		}
		return true;
		}

}