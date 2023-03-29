package com.xworkz.birthdays.app.repository;

import com.xworkz.birthdays.app.dto.BirthdayDTO;

public interface BirthdayRepository {

	abstract boolean onSave(BirthdayDTO dto);
	abstract boolean onUpdate(int cake_price);
	abstract boolean onRead();
	abstract boolean onUpdate1(int mens);
	abstract boolean onUpdate2(int womens);
	abstract boolean onDelete(int womens);

	
	
	
	
}
