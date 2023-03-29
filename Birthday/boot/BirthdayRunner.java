package com.xworkz.birthdays.app.boot;

import com.xworkz.birthdays.app.dto.BirthdayDTO;
import com.xworkz.birthdays.app.repository.BirthdayRepository;
import com.xworkz.birthdays.app.repository.BirthdayRepositorytIMPL;
import com.xworkz.birthdays.app.service.BirthdayService;
import com.xworkz.birthdays.app.service.BirthdayServiceIMPL;

public class BirthdayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BirthdayDTO dto=new BirthdayDTO(3, 9, "cupCake", "light",2000 );
		BirthdayDTO dto1=new BirthdayDTO(4, 10, "chokoCake", "sun",3000 );
		BirthdayDTO dto2=new BirthdayDTO(5, 11, "appleCake", "moon",4000 );
		BirthdayDTO dto3=new BirthdayDTO(7, 12, "painapleCake", "fire",5000 );
		BirthdayDTO dto4=new BirthdayDTO(7, 13, "silverCake", "brite",6000 );
		BirthdayDTO dto5=new BirthdayDTO(8, 14, "forestCake", "prakasha",7000 );
		
		
	
		
		BirthdayRepository birthdayRepository=new BirthdayRepositorytIMPL();
		
		
		BirthdayService birthdayService=new BirthdayServiceIMPL(birthdayRepository);
				
		birthdayService.ValideAndSave(dto);
		birthdayService.ValideAndSave(dto1);
		birthdayService.ValideAndSave(dto2);
		birthdayService.ValideAndSave(dto3);
		birthdayService.ValideAndSave(dto4);
		birthdayService.ValideAndSave(dto5);

		
		
		System.out.println("update start--------");
         birthdayService.UpdateDTO(501);
 		System.out.println("update end-----------");

        birthdayService.UpdateDTO1(2);

 		
		birthdayService.UpdateDTO2(1);
		
		
		
		
		
		System.out.println("delete start ++++++++");
		birthdayService.Delete(9);
		System.out.println("delete end -----------");
		
		System.out.println("Reading start ++++++++");
		birthdayService.read();
		System.out.println("Reading end -----------");
	
	
	
	}

}
