package com.gasSales.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gasSales.dao.SalesDAO;
import com.gasSales.entity.GasResponse;
import com.gasSales.entity.Results;
import com.gasSales.entity.Sales;

@Service
public class SalesServiceImpl implements SalesService {

	@Autowired
	private SalesDAO salesDAO;
	
	@Override
	@Transactional
	public List<Sales> getSales() {
		return salesDAO.getSales();
	}

	@Override
	@Transactional
	public String saveSale(Sales sale) {
		String validacionCampos = firstLevelValidations(sale);
		
		if(validacionCampos.isEmpty() || validacionCampos.length() <= 2) {
			Results result = requestGasId(sale.getGasStation());
			
			if(salesDAO.getResult(result.get_id()) == null) {
				salesDAO.saveResult(result);
			}
			salesDAO.saveSale(sale);
			
		}else {
			return validacionCampos;
			
		}
		return "OK";
	}

	@Override
	@Transactional
	public Sales getSale(int theId) {
		
		return salesDAO.getSale(theId);
	}

	@Override
	@Transactional
	public void deleteSale(int theId) {
		
		salesDAO.deleteSale(theId);
	}

	@Override
	public Results requestGasId(String theId) {
		 URL urlForGetRequest = null;
		 String readLine = null;
		 HttpURLConnection conection = null;
		 int responseCode = 0;
		 GasResponse gasResponse = null;
		 BufferedReader in = null;
		 Results result = null;
		try {
			
			urlForGetRequest = new URL("https://api.datos.gob.mx/v1/precio.gasolina.publico?_id=" + theId);
			conection = (HttpURLConnection) urlForGetRequest.openConnection();
			conection.setRequestProperty("Connection", "keep-alive");
			conection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			conection.setRequestProperty("Accept-Charset", "UTF-8");
			conection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36");
			conection.setRequestProperty("Accept-Language", "ko-KR,ko;q=0.8,es-ES;q=0.6,en;q=0.4");
			
			responseCode = conection.getResponseCode();

		    if (responseCode == HttpURLConnection.HTTP_OK) {
		        
					in = new BufferedReader(
					    new InputStreamReader(conection.getInputStream()));
		        StringBuffer response = new StringBuffer();
		        
				while ((readLine = in .readLine()) != null) {
					    response.append(readLine);
				}
				
				ObjectMapper mapper = new ObjectMapper();
				gasResponse = mapper.readValue(response.toString(), GasResponse.class);
				
				for (Results x : gasResponse.getResults()) {
					result = x;
				}
		        in .close();
		        
		    } else {
		    	//exception
		    }
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	    
		return result;
	}
	
	public String firstLevelValidations(Sales sale) {
		StringBuilder errors = new StringBuilder();
	
		errors.append(min(sale.getAmount(),1, "Amount. "));
		errors.append(min(sale.getCardNumber(),16, "CardNumber. "));
		errors.append(min(sale.getEmail(),10, "Email. "));
		errors.append(min(sale.getExpirationDateMonth(),2, "Month. "));
		errors.append(min(sale.getExpirationDateYear(),4, "Year. "));
		errors.append(min(sale.getGasStation(),24, "GasStation. "));
		errors.append(min(sale.getGasType(),1, "GasType. "));
		errors.append(min(sale.getLastName(),4, "LastName. "));
		errors.append(min(sale.getName(),3, "Name. "));
		errors.append(min(sale.getSellerName(),4, "SellerName. "));

		return errors.toString();
		
	}
	
	public <E> String min(E type, int min, String campo) {
		
		switch (type.getClass().getSimpleName()) {
		
		case "Integer":
			return Integer.parseInt(type.toString()) >= min ? "" : "Quantity error: " + campo;
			
		case "String":
			return type.toString().length() >= min ? "" : "Length Error: " + campo;
			
		case "Double":
			return Double.parseDouble(type.toString()) >= min ? "" : "Quantity error: " + campo;
		}

		return "";
	}
	
}





