package com.xworkz.festival.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.mysql.cj.xdevapi.Schema.Validation;
import com.xworkz.festival.app.dto.FestivalDTO;
import com.xworkz.festival.app.repository.FestivalRepository;

public class FestivalServiceIMPL implements FestivalService {

	FestivalRepository festivalRepository;

	public FestivalServiceIMPL() {
		System.out.println("FestivalServiceIMPL default constructor");
	}

	public FestivalServiceIMPL(FestivalRepository festivalRepository) {
		// TODO Auto-generated method stub

		this.festivalRepository = festivalRepository;
	}

	@Override
	public boolean valideAndSave(FestivalDTO dto) {
		// TODO Auto-generated method stub

		System.out.println("inside  valideAndSave method  (valideAndSave(FestivalDTO dto))");

		if (dto != null) {

			ValidatorFactory factory = javax.validation.Validation.buildDefaultValidatorFactory();
			// ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();

			Set<ConstraintViolation<FestivalDTO>> violationMsg = validator.validate(dto);

			if (violationMsg.isEmpty()) {
				boolean save = this.festivalRepository.onSave(dto);
				System.out.println(save);

			} else {
				System.out.println(violationMsg.toString());
			}
		} else {

			System.out.println("dto is empty  (valideAndSave(FestivalDTO dto))");
		}
		return true;
	}

	@Override
	public boolean updateDTO(int gifts) {
		// TODO Auto-generated method stub

		if (gifts != 0) {
			System.out.println("you can update the data  (updateDTO(int gifts))");

			boolean update = this.festivalRepository.onUpdate(gifts);
			System.out.println(update);

		} else {
			System.out.println("you can't update  (updateDTO(int gifts))");
		}

		return true;
	}

	@Override
	public boolean read() {
		// TODO Auto-generated method stub

		boolean read = this.festivalRepository.onRead();
		return true;
	}

	@Override
	public boolean UpdateDTO1(String ugadi) {
		// TODO Auto-generated method stub
		if (ugadi != null) {
			System.out.println("you can update the data  (UpdateDTO1(String ugadi )");

			boolean update = this.festivalRepository.onUpdate1(ugadi);
			System.out.println(update);

		} else {
			System.out.println("you can't update  (UpdateDTO1(String ugadi))");
		}

		return true;
	}

	@Override
	public boolean UpdateDTO2(String sweet) {
		// TODO Auto-generated method stub
		if (sweet != null) {
			System.out.println("you can update the data  (UpdateDTO2(String sweet))");

			boolean update = this.festivalRepository.onUpdate2(sweet);
			System.out.println(update);

		} else {
			System.out.println("you can't update (UpdateDTO2(String sweet))");
		}

		return true;
	}

}
