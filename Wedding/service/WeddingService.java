package com.xworkz.wedding.app.service;

import com.xworkz.wedding.app.dto.WeddingDTO;

public interface WeddingService {

	abstract boolean ValideAndSave(WeddingDTO dto);
	abstract boolean updateDTO(int peoples);
	abstract boolean read();


}
