package com.gasSales.service;

import java.util.List;

import com.gasSales.entity.Results;
import com.gasSales.entity.Sales;

public interface SalesService {

	public List<Sales> getSales();

	public String saveSale(Sales sale);

	public Sales getSale(int theId);

	public void deleteSale(int theId);
	
	public Results requestGasId(String theId);
	
}
