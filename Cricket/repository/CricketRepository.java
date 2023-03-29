package com.xworkz.cricket.app.repository;

import com.xworkz.cricket.app.dto.CricketDTO;

public interface CricketRepository {

	abstract boolean onSave(CricketDTO dto);
	
}
