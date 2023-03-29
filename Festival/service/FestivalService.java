package com.xworkz.festival.app.service;

import com.xworkz.festival.app.dto.FestivalDTO;

public interface FestivalService {

	abstract boolean valideAndSave(FestivalDTO dto);

	abstract boolean updateDTO(int gift);

	abstract boolean read();

	abstract boolean UpdateDTO1(String ugadi);

	abstract boolean UpdateDTO2(String sweet);

}
