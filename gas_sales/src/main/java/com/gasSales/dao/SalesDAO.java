package com.gasSales.dao;

import java.util.List;

import com.gasSales.entity.Results;
import com.gasSales.entity.Sales;

public interface SalesDAO {

	public List<Sales> getSales();

	public void saveSale(Sales sale);

	public Sales getSale(int theId);

	public void deleteSale(int theId);

	public void saveResult(Results result);
	
	public Results getResult(String string);
	
}
