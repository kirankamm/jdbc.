package com.xworkz.shopping.app.boot;

import com.xworkz.shopping.app.dto.ShoppingDTO;
import com.xworkz.shopping.app.repository.ShoppingRepository;
import com.xworkz.shopping.app.repository.ShoppingRepositoryIMPL;
import com.xworkz.shopping.app.service.ShoppingService;
import com.xworkz.shopping.app.service.ShoppingServiceIMPL;

public class ShoppingRunner {
public static void main(String[] args) {
	
	
	ShoppingDTO shoppingDTO=new ShoppingDTO(9, 50, 1, "rangita", "janani");
	ShoppingDTO shoppingDTO1=new ShoppingDTO(10, 51, 2, "sanvi", "ranu");
	ShoppingDTO shoppingDTO2=new ShoppingDTO(11, 52, 3, "sakshi", "barat");
	ShoppingDTO shoppingDTO3=new ShoppingDTO(12, 53, 4, "sakti", "nilkanta");
	ShoppingDTO shoppingDTO4=new ShoppingDTO(13, 54, 5, "namitha", "liki");
	
	
	ShoppingRepository shoppingRepository=new ShoppingRepositoryIMPL();
	
	ShoppingService shoppingService=new ShoppingServiceIMPL(shoppingRepository);
	
	shoppingService.ValidateAndSave(shoppingDTO);
	
	
    shoppingService.UpdateDTO(null);

    shoppingService.ValidateAndSave(shoppingDTO);
    shoppingService.ValidateAndSave(shoppingDTO1);
    shoppingService.ValidateAndSave(shoppingDTO2);
    shoppingService.ValidateAndSave(shoppingDTO3);
    shoppingService.ValidateAndSave(shoppingDTO4);

    
    System.out.println("Start read");
    shoppingService.read();
    System.out.println("end read");

}
}
