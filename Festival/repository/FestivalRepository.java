package com.xworkz.festival.app.repository;

import com.xworkz.festival.app.dto.FestivalDTO;

public interface FestivalRepository  {

	abstract boolean onSave(FestivalDTO dto);
	abstract boolean onUpdate(int gifts);
	abstract boolean onRead();
	abstract boolean onUpdate1(String ugadi);
	abstract boolean onUpdate2(String sweet);
	abstract boolean onDelete(String ugadi);

}
