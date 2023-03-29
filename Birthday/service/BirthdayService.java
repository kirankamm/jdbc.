package com.xworkz.birthdays.app.service;

import com.xworkz.birthdays.app.dto.BirthdayDTO;

public interface BirthdayService {

	abstract boolean ValideAndSave(BirthdayDTO dto);
	abstract boolean UpdateDTO(int cake_price);
	abstract boolean read();
	abstract boolean UpdateDTO1(int mens);
	abstract boolean UpdateDTO2(int womens);
	abstract boolean Delete(int womens);
	
	 
}
