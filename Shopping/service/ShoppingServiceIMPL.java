package com.xworkz.shopping.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.shopping.app.dto.ShoppingDTO;
import com.xworkz.shopping.app.repository.ShoppingRepository;

public class ShoppingServiceIMPL implements ShoppingService {

	ShoppingRepository shoppingRepository;

	public ShoppingServiceIMPL() {
		System.out.println("default constrator ShoppingServiceIMPL");
	}

	public ShoppingServiceIMPL(ShoppingRepository shoppingRepository) {

		this.shoppingRepository = shoppingRepository;
	}

	@Override
	public boolean ValidateAndSave(ShoppingDTO dto) {
		// TODO Auto-generated method stub

		if (dto!=null) {
			
			ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
			
			Validator validator=validatorFactory.getValidator();
				
				Set<ConstraintViolation<ShoppingDTO>> constraintViolations=validator.validate(dto);
	
				
		if (constraintViolations.isEmpty()) {
	    boolean save =this.ValidateAndSave(dto);		
			System.out.println(save);
		} else {
        System.out.println(constraintViolations.toString());
			
		}
		
		
		}else{
			System.out.println("dto is empty");	
		}

	return false;
      }

	@Override
	public boolean UpdateDTO(String worker_name) {
		// TODO Auto-generated method stub

		if (worker_name!=null) {
			boolean Update=this.UpdateDTO(worker_name); 
			System.out.println(Update);
		} else {
        System.out.println("not update");
		}
		
		return true;
	}

	@Override
	public boolean read() {
		// TODO Auto-generated method stub
		
		boolean readd=this.shoppingRepository.onRead();
		return true;
	}
	
	

	@Override
	public boolean UpdateDTO1(int wacth_shop) {
		// TODO Auto-generated method stub
		if (wacth_shop!=0) {
			boolean Update=this.UpdateDTO1(wacth_shop); 
			System.out.println(Update);
		} else {
        System.out.println("not update");
		}
		
		return true;
	}

	
	@Override
	public boolean UpdateDTO2(String mall_owner_name) {
		// TODO Auto-generated method stub
		if (mall_owner_name!=null) {
			boolean Update=this.UpdateDTO2(mall_owner_name); 
			System.out.println(Update);
		} else {
        System.out.println("not update");
		}
		
		return true;
	}

}
