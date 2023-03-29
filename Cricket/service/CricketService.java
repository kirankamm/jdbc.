package com.xworkz.cricket.app.service;

import com.xworkz.cricket.app.dto.CricketDTO;

public interface CricketService {

   abstract boolean validateAndSave(CricketDTO dto);
   
}
