package com.xworkz.wedding.app.boot;

import com.xworkz.wedding.app.dto.WeddingDTO;
import com.xworkz.wedding.app.repository.WeddingRepository;
import com.xworkz.wedding.app.repository.WeddingRepositoryIMPL;
import com.xworkz.wedding.app.service.WeddingService;
import com.xworkz.wedding.app.service.WeddingServiceIMPL;

public class WeddingRunner {
public static void main(String[] args) {
	
	WeddingDTO dto=new WeddingDTO(50, 20, 20, "belagavi","peda");
	WeddingDTO dto1=new WeddingDTO(50, 20, 20, "belagavi","peda");
	WeddingDTO dto2=new WeddingDTO(50, 20, 20, "belagavi","peda");
	WeddingDTO dto3=new WeddingDTO(50, 20, 20, "belagavi","peda");
	WeddingDTO dto4=new WeddingDTO(50, 20, 20, "belagavi","peda");

	WeddingRepository weddingRepository=new WeddingRepositoryIMPL();
	
	WeddingService weddingService=new WeddingServiceIMPL(weddingRepository);
	

	
	

	System.out.println("read start++++++++++");
	weddingService.ValideAndSave(dto);
	System.out.println("read end----------");
	
	System.out.println("read start++++++++++");
	weddingService.ValideAndSave(dto1);
	System.out.println("read end----------");
	
	
	System.out.println("read start++++++++++");
	weddingService.ValideAndSave(dto2);
	System.out.println("read end----------");
	
	System.out.println("read start++++++++++");
	weddingService.ValideAndSave(dto3);
	System.out.println("read end----------");
	
	System.out.println("read start++++++++++");
	weddingService.ValideAndSave(dto4);
	System.out.println("read end----------");
	
	
	System.out.println("read start++++++++++");
	weddingService.updateDTO(3);
	System.out.println("read end----------");

	
	
	System.out.println("read start++++++++++");
    weddingService.read();
	System.out.println("read end----------");

}
}
