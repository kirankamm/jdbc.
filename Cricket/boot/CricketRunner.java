package com.xworkz.cricket.app.boot;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.cricket.app.dto.CricketDTO;
import com.xworkz.cricket.app.repository.CricketRepository;
import com.xworkz.cricket.app.repository.CricketRepositoryIMPL;
import com.xworkz.cricket.app.service.CricketService;
import com.xworkz.cricket.app.service.CricketServiceIMPL;

public class CricketRunner {
	
	public static void main(String[] args) {
		
		System.out.println("this is  project");

		CricketDTO dto= new CricketDTO(10,15,100,"RCB","virat",1,2,"chinnaswami");

		String query="insert into ipl values(?,?,?,?,?,?,?,?)";
		CricketRepository repository=new CricketRepositoryIMPL(query);
		
		CricketService service=new CricketServiceIMPL(repository);
		
		service.validateAndSave(dto);
	}
}
