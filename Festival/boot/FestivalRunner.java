package com.xworkz.festival.app.boot;

import com.xworkz.festival.app.dto.FestivalDTO;
import com.xworkz.festival.app.repository.FestivalRepository;
import com.xworkz.festival.app.repository.FestivalRepositoryIMPL;
import com.xworkz.festival.app.service.FestivalService;
import com.xworkz.festival.app.service.FestivalServiceIMPL;

public class FestivalRunner {
	public static void main(String[] args) {

		FestivalDTO dto = new FestivalDTO("newyear", "laddu", "treaditional", 2, 11);
		FestivalDTO dto1 = new FestivalDTO("fewHour", "pede", "treaditional", 3, 12);
		FestivalDTO dto2 = new FestivalDTO("fewSecond", "mix", "treaditional", 4, 13);
		FestivalDTO dto3 = new FestivalDTO("just", "maisurPak", "treaditional", 5, 14);
		FestivalDTO dto4 = new FestivalDTO("now", "chakli", "treaditional", 6, 15);

		FestivalRepository festivalRepository = new FestivalRepositoryIMPL();

		FestivalService festivalService = new FestivalServiceIMPL(festivalRepository);

		System.out.println("valideAndSave start++++++++");
		festivalService.valideAndSave(dto);
		System.out.println("valideAndSave end--------");

		System.out.println("valideAndSave start++++++++");
		festivalService.valideAndSave(dto1);
		System.out.println("valideAndSave end--------");
 
		System.out.println("valideAndSave start++++++++");
		festivalService.valideAndSave(dto2);
		System.out.println("valideAndSave end--------");

		System.out.println("valideAndSave start++++++++");
		festivalService.valideAndSave(dto3);
		System.out.println("valideAndSave end--------");

		System.out.println("valideAndSave start++++++++");
		festivalService.valideAndSave(dto4);
		System.out.println("valideAndSave end--------");

		System.out.println("update start++++++++++");
		festivalService.updateDTO(1);
		System.out.println("update end----------");

		System.out.println("read start++++++++++");
		festivalService.read();
		System.out.println("read end----------");

	}

}
