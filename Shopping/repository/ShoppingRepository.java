package com.xworkz.shopping.app.repository;

import com.xworkz.shopping.app.dto.ShoppingDTO;

public interface ShoppingRepository {
	
abstract boolean onSave(ShoppingDTO dto);
abstract boolean onUpdate(String worker_name );

abstract boolean onRead();

abstract boolean onUpdate1(int wacth_shop);
abstract boolean onUpdate2(String mall_owner_name);

}
