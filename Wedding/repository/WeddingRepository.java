package com.xworkz.wedding.app.repository;

import com.xworkz.wedding.app.dto.WeddingDTO;

public interface WeddingRepository {

	abstract boolean onSave(WeddingDTO dto);
	abstract boolean onUpdate(int pepoles);
	abstract boolean onRead();


}
