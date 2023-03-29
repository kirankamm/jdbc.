package com.xworkz.shopping.app.service;

import com.xworkz.shopping.app.dto.ShoppingDTO;

public interface ShoppingService {

	
	abstract boolean ValidateAndSave(ShoppingDTO dto);
	abstract boolean UpdateDTO(String worker_name );
	abstract boolean read();
	
	abstract boolean UpdateDTO1(int wacth_shop);
	abstract boolean UpdateDTO2(String mall_owner_name);
	
}
